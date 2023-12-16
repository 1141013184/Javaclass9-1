package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.*; import java.util.function.Function; import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
    // 1. Запрос со сбором данных в коллекцию
    List<Integer> list = new Random().ints(1000, 10, 10000)
            .boxed()
            .collect(Collectors.toList());

    // 2. Запрос на подсчет количества (например, простых чисел)
    long count = new Random().ints(1000, 10, 10000)
            .filter(num -> {
                if (num < 2) {
                    return false;
                }
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        return false;
                    }
                }
                return true;
            })
            .count();

    // 3. Запрос, где применяем редукцию множества значений к одному
    int sum = new Random().ints(1000, 10, 10000)
            .sum();

    // 4. Просто вывод на консоль
    new Random().ints(1000, 10, 10000)
            .forEach(System.out::println);

    // 5. Запрос с формированием результата в карту
    Map<Integer, Long> map = new Random().ints(1000, 10, 10000)
            .boxed()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
}
}
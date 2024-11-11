package lesson1;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Map;

public class Lesson5 {

    private static Map<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) {

        // Факториал
        /*System.out.println(factorial(0));
        System.out.println(factorial(-12));
        System.out.println(factorial(5));
        System.out.println(factorial(8));*/

        // Фибоначи
        System.out.println(fibonacci(6));
    }

    // 1. Факториал числа
    // при больших данных юзать BigDecimal
    private static int factorial(int n) {
        // прерываю при 0 или 1 или отрицательное число
        if (n < 0)
            return -1;
        else if (n <= 1)
            return 1;

        // умножаю данное число на последующие цифры, например если n = 5, то на 4,3,2,1
        return n * factorial(n - 1);
    }

    // 2. Числа Фибоначчи
    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        // если мы уже вычисляли, то возвращаем
        if (map.containsKey(n)) {
            return map.get(n);
        }

        // вычисляю число фибоначчи вызвав рекурсию и сохранением результата в мапу
        int result = fibonacci(n - 1) + fibonacci(n - 2);
        map.put(n, result);

        return result;
    }
}

package lesson1;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Map;

public class Lesson5 {

    private static Map<Integer, Integer> map = new HashMap<>();
    private static int sum = 0;

    public static void main(String[] args) {

        // Факториал
        System.out.println(factorial(0));
        System.out.println(factorial(-12));
        System.out.println(factorial(5));
        System.out.println(factorial(8));

        // Фибоначи
        System.out.println(fibonacci(6));

        // Сумма чисел
        System.out.println(sum(10));
        System.out.println(sum(1));

        // СТепень
        System.out.println(degree(2,3));
        System.out.println(degree(2,1));
        System.out.println(degree(2,0));

        // Палиндром
        System.out.println(isPalindrome("level"));
        System.out.println(isPalindrome(""));
        System.out.println(isPalindrome("a"));
        System.out.println(isPalindrome("azamat"));
        System.out.println(isPalindrome("root"));
        System.out.println(isPalindrome("qwfgwq"));
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
    private static int fibonacci(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        // если мы уже вычисляли, то возвращаем
        if (map.containsKey(n)) {
            return map.get(n);
        }

        // вычисляю число фибоначчи вызвав рекурсию и сохранением результата в мапу
        int result = fibonacci(n - 1) + fibonacci(n - 2);
        map.put(n, result);

        return result;
    }

    // 3. Сумма чисел от 1 до n
    private static int sum(int n) {
        if (n == 1) {
            return 1;
        }

        // декремент и добавляю все числа
        return n + sum(n - 1);
    }

    // 4. Возведение числа в степень
    private static int degree(int n, int m) {
        // елси степень равен нуллю то возваращаю 1
        if (m == 0) {
            return 1;
        } else if (m == 1) {
            return n; // если степень единица - возвращаю n
        }

        // умножаю число на декремент степени
        return n * degree(n, m - 1);
    }

    // 5. Палиндром
    public static boolean isPalindrome(String s) {
        // если размер равен единице или нуллю - то это палнидром
        if (s.length() <= 1) {
            return true;
        }

        // если после рекурсий элементы не равны, то это не палиндром
        if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        }

        // сравниваю перый и последний элемент, если при каждой итерации находим палиндром - перехожу на следующие элементы
        return isPalindrome(s.substring(1, s.length() - 1));
    }
}

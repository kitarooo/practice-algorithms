package lesson1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lesson4 {
    public static void main(String[] args) {

    }

    // 1. Функция, которая возвращает первый элемент в списке чисел.
    private static int task1(int[] nums) {
        return nums[0];
    }

    // 2. Функция, которая проверяет, является ли число четным или нечетным.
    private static boolean task2(int number) {

        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }


    // 3. Найдите квадрат числа.
    private static int task3(int number) {
        return number * number;
    }

    // 4. Проверьте, больше ли данное число 100.
    private static boolean task4(int number) {
        if (number > 100) {
            return true;
        } else {
            return false;
        }
    }

    // 5. Функция, которая всегда возвращает число 5.
    private static int task5() {
        return 5;
    }

// Задачи O(N):

    // 6. Определите сумму всех чисел от 1 до N.
    private static int task6(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum += i;
        }

        return sum;
    }

    // 7. Проверьте, является ли число простым.
    private static boolean task7(int number) {
        if (number <= 1) {
            System.out.println(number + " is not a prime number");
            return false;
        }

        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }


    // 8. Найдите наибольшее число среди N чисел.
    private static int task8(int[] nums) {
        int max = nums[0];
        for (int value : nums) {
            if (value > max) {
                max = value;
            }
        }

        return max;
    }

    // 9. Подсчитайте количество четных чисел в последовательности чисел от 1 до N.
    private static int task9(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    // 10. Найдите количество цифр в числе.
    private static int task10(int number) {
        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }

        return count;
    }

    // 11. Функция для проверки, есть ли два числа в массиве, сумма которых равна target.
    private static List<String> task11(int[] nums, int target) {
        List<String> results = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    results.add("Сумма чсел " + nums[i] + " и " + nums[j] + " равна " + target);
                }
            }
        }

        return results;
    }

    // 12. Реализовать пузырьковую сортировку для чисел.
    private static void task12(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }

    // 13. Проверить, является ли строка палиндромом.
    private static boolean task13(String s) {
        int length = s.length();
        for (int i = 0; i < length / 2; i++) {
            if (s.charAt(i) != s.charAt(length - i - 1)) {
                return false;
            }
        }

        return true;
    }

    // 14. Найти все уникальные пары чисел, произведение которых четное.
    private static List<String> task14(int[] nums) {
        List<String> results = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] * nums[j]) % 2 == 0) {
                    results.add("Пара чисел " + nums[i] + " и " + nums[j] + " четное произведение."
                    );
                }
            }
        }

        return results;
    }

    // 15. Реализовать сортировку выбором.
    private static int[] task15(int[] nums) {
        int[] sortedArr = Arrays.copyOf(nums, nums.length);

        for (int i = 0; i < sortedArr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < sortedArr.length; j++) {
                if (sortedArr[j] < sortedArr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = sortedArr[i];
            sortedArr[i] = sortedArr[minIndex];
            sortedArr[minIndex] = temp;
        }

        return sortedArr;
    }

    // 16. Напишите функцию, которая считает сумму всех чисел от 1 до N и от 1 до K.
    public int task16(int n, int k) {
        int sumN = 0;
        int sumK = 0;

        for (int i = 1; i <= n; i++) {
            sumN += i;
        }

        for (int i = 1; i <= k; i++) {
            sumK += i;
        }

        return sumN + sumK;
    }

    // 17. Определите наибольшее число среди чисел N и чисел K.
    public int task17(int[] numsN, int[] numsK) {
        int maxN = Integer.MIN_VALUE;
        int maxK = Integer.MIN_VALUE;

        for (int num : numsN) {
            if (num > maxN) {
                maxN = num;
            }
        }

        for (int num : numsK) {
            if (num > maxK) {
                maxK = num;
            }
        }

        return Math.max(maxN, maxK);
    }

    // 18. Найдите количество цифр в числе и сумму всех чисел от 1 до K.
    public int[] task18(int number) {
        int digitCount = 0;
        int sum = 0;
        int temp = number;

        for (int i = 1; i <= number; i++) {
            sum += i;
        }

        while (temp > 0) {
            digitCount++;
            temp /= 10;
        }

        return new int[] {digitCount, sum};
    }

    // 19. Напишите программу, которая выводит все простые числа до N и до K.
    public void task19(int n, int k) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }

        for (int i = 2; i <= k; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    private boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    // 20. Проверьте, содержат ли числа от 1 до N и от 1 до K хотя бы одно общее число.
    public boolean task20(int n, int k) {
        int min = Math.min(n, k);

        for (int i = 1; i <= min; i++) {
            return true;
        }

        return false;
    }

    // 21. Напишите функцию для нахождения всех пар чисел, где одно число из диапазона N, а другое из диапазона K.
    public List<int[]> task21(List<Integer> n, List<Integer> k) {
        List<int[]> pairs = new ArrayList<>();

        for (int vN : n) {
            for (int vK : k) {
                pairs.add(new int[]{vN, vK});
            }
        }

        return pairs;
    }

    // * 22. Проверьте, есть ли среди чисел от 1 до N и от 1 до K такие, которые делятся друг на друга без остатка.
    public List<int[]> task22(int n, int k) {
        List<int[]> divisiblePairs = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= k; j++) {
                if (i % j == 0 || j % i == 0) {
                    divisiblePairs.add(new int[]{i, j});
                }
            }
        }

        return divisiblePairs;
    }

    // * 23. Найдите произведение всех пар чисел из диапазона N и K.
    public List<Integer> task23(int[] n, int[] k) {
        List<Integer> products = new ArrayList<>();

        for (int i : n) {
            for (int j : k) {
                products.add(i * j);
            }
        }

        return products;
    }

    // * 24. Реализуйте алгоритм поиска наибольшего общего делителя для всех пар чисел от 1 до N и от 1 до K.
    public List<Integer> task24(int n, int k) {
        List<Integer> gcdValues = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= k; j++) {
                gcdValues.add(gcd(i, j));
            }
        }

        return gcdValues;
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    // * 25. Напишите функцию для нахождения всех комбинаций сумм чисел из диапазонов N и K.
    public List<Integer> task25(int[] n, int[] k) {
        List<Integer> sums = new ArrayList<>();
        for (int i : n) {
            for (int j : k) {
                sums.add(i + j);
            }
        }
        return sums;
    }

    // * 26. Найдите все числа, которые являются кратными как для диапазона N, так и для диапазона K.
    public List<int[]> task26(int[] n, int[] k) {
        List<int[]> multiples = new ArrayList<>();

        for (int i : n) {
            for (int j : k) {
                if ((i % j == 0 || j % i == 0) && i != 0 && j != 0) {
                    multiples.add(new int[]{i, j});
                }
            }
        }

        return multiples;
    }

    // * 27. Реализуйте функцию, которая проверяет каждую строку длины N с каждой строкой длины K на совпадение символов.
    public List<int[]> task27(String n, String k) {
        List<int[]> matchingChars = new ArrayList<>();

        for (int i = 0; i < n.length(); i++) {
            for (int j = 0; j < k.length(); j++) {
                if (n.charAt(i) == k.charAt(j)) {
                    matchingChars.add(new int[]{i, j});
                }
            }
        }

        return matchingChars;
    }

    // * 28. Найдите количество всех возможных перестановок двух строк, одна длиной N, другая — K.
    public int task28(String n, String k) {
        return factorial(n.length()) * factorial(k.length());
    }

    private int factorial(int n) {
        return n <= 1 ? 1 : n * factorial(n - 1);
    }

    // * 29. Напишите функцию для проверки того, содержат ли два числа из диапазонов N и K одинаковое количество делителей.
    public List<int[]> task29(int[] n, int[] k) {
        List<int[]> sameDivisors = new ArrayList<>();

        for (int i : n) {
            for (int j : k) {
                if (countDivisors(i) == countDivisors(j)) {
                    sameDivisors.add(new int[]{i, j});
                }
            }
        }

        return sameDivisors;
    }

    private int countDivisors(int num) {
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        return count;
    }

    // * 30. Найдите все общие простые множители для чисел из диапазона N и K.
    public List<int[]> task30(int[] n, int[] k) {
        List<int[]> commonPrimeFactors = new ArrayList<>();

        for (int i : n) {
            for (int j : k) {
                List<Integer> factors = findCommonPrimeFactors(i, j);
                if (!factors.isEmpty()) {
                    commonPrimeFactors.add(new int[]{i, j});
                }
            }
        }

        return commonPrimeFactors;
    }

    private List<Integer> findCommonPrimeFactors(int a, int b) {
        List<Integer> factors = new ArrayList<>();

        for (int i = 2; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0 && isPrime2(i)) {
                factors.add(i);
            }
        }

        return factors;
    }

    private boolean isPrime2(int num) {
        if (num < 2) return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }

        return true;
    }

}


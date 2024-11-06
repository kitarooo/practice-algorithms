package lesson1;

import java.util.*;

public class Lesson3 {
    public static void main(String[] args) {

    }


    // Задание 1: Сортировка с подсчётом
    private static void sortWithCount(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    count++;
                }
            }
        }

        System.out.println("Кол-во перестановок: " + count);
        System.out.println(Arrays.toString(nums));
    }

    // Задание 2: Рекурсивный поиск суммы массива
    public static int recursiveSum(int[] nums, int index) {
        return nums[index] + recursiveSum(nums, index + 1);
    }

    // Задание 3: Поиск среднего арифметического с исключением максимума
    public static int findMid(int[] nums) {
        int[] resultNums = findMax(nums);
        int sum = 0;

        for (int i = 0; i < resultNums.length; i++) {
            sum += resultNums[i];
        }

        return sum / resultNums.length;
    }

    public static int[] findMax(int[] nums) {
        Arrays.sort(nums);

        int[] array = new int[nums.length -1];
        for (int i = 0; i < nums.length - 2; i++) {
            array[i] = nums[i];
        }

        return array;
    }

    // Задание 4: Переворот строки с использованием стека
    private static String lineBreak(String s) {
        Stack<Character> stack = pushToStack(s);
        StringBuilder sb = new StringBuilder();

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.toString();
    }

    private static Stack<Character> pushToStack(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }

        return stack;
    }


    // Задание 5: НОД двух чисел с использованием алгоритма Евклида
    public static int finNOD(int a, int b) {
        return euclideanAlgorithm(a, b);
    }

    private static int euclideanAlgorithm(int a, int b) {
        if (b == 0) {
            return a;
        }

        return euclideanAlgorithm(b, a % b);
    }
}















package lesson1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Lesson2 {
    public static void main(String[] args) {

    }

    // 1. Найти сумму элементов массива
    private static int arraySum(int[] nums) {
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }

        return sum;
    }

    // 2. Найти максимальный элемент в массиве
    private static int findMax(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }

        return max;
    }

    // 3. Найти минимальный элемент в массиве
    private static int findMin(int[] nums) {
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (min > nums[i]) {
                min = nums[i];
            }
        }

        return min;
    }

    // 4. Найти индекс заданного элемента в массиве (либо -1, если не найден)
    private static int findIndex(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }

        return -1;
    }

    // 5. Отсортировать массив по возрастанию
    public static void ascendingOrder(int[] nums) {
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

    // 6. Отсортировать массив по убыванию
    public static void descendingOrder(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // 7. Найти количество вхождений заданного элемента в массиве
    private int numCount(int[] nums, int target) {
        int count = 0;

        for (int i : nums) {
            if (i == target) {
                count++;
            }
        }

        return count;
    }

    // 8. Проверить, есть ли в массиве повторяющиеся элементы
    private boolean isDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int i : nums) {
            if (set.contains(i)) {
                return true;
            }
            set.add(i);
        }

        return false;
    }

    // 9. Поменять местами первый и последний элемент массива
    private static int[] swapFirstAndEnd(int[] nums) {
        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = nums[0];

        return nums;
    }

    // 10. Сдвинуть все элементы массива на одну позицию вправо
    private static void rightShift(int[] nums) {
        int end = nums[nums.length - 1];

        for (int i = nums.length - 1; i > 0; i--) {
            nums[i] = nums[i - 1];
        }
        nums[0] = end;
    }

    // 11. Сдвинуть все элементы массива на одну позицию влево
    private static void leftShift(int[] nums) {
        int start = nums[0];

        for (int i = 0 ; i < nums.length - 1 ; i++) {
            nums[i] = nums[i + 1];
        }
        nums[nums.length - 1] = start;
    }

    // 12. Инвертировать (развернуть) массив
    private static void invertArray(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }

    // 13. Удалить все нулевые элементы из массива
    private static int[] deleteZero(int[] nums) {
        return Arrays.stream(nums).filter(n -> n != 0).toArray();
    }

    // 14. Подсчитать количество четных и нечетных элементов в массиве
    private static void counter(int[] nums) {
        int even = 0;
        int odd = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Четных: " + even);
        System.out.println("Нечетных: " + odd);
    }

    // 15. Суммировать элементы на четных индексах
    private static int evenSum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                sum += nums[i];
            }
        }

        return sum;
    }

    // 16. Суммировать элементы на нечетных индексах
    private static int oddSum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 != 0) {
                sum += nums[i];
            }
        }

        return sum;
    }

    // 17. Создать новый массив, содержащий только положительные элементы исходного массива
    private static int[] positiveNums(int[] nums) {
        return Arrays.stream(nums).filter(n -> n > 0).toArray();
    }

    // 18. Создать новый массив, содержащий только отрицательные элементы исходного массив
    private static int[] negativeNums(int[] nums) {
        return Arrays.stream(nums).filter(n -> n < 0).toArray();
    }

    // 19. Найти второй по величине элемент в массиве
    private static int findSecondMax(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length - 2];
    }

}



















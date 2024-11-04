package lesson1;

import java.util.Scanner;

public class Algo {
    public static void main(String[] args) {

        // 15.Реализуйте программу, которая запрашивает у пользователя числа,
        //пока он не введёт число 0, и выводит сумму всех введённых чисел
        Scanner scanner1 = new Scanner(System.in);
        int sum = 0;
        int num;

        while (true) {
            num = scanner1.nextInt();
            if (num == 0) {
                break;
            }
            sum += num;
        }
        System.out.println(sum);


        // 16.Напишите программу, которая запрашивает у пользователя пароль, и
        // если он неверный, программа продолжает запрашивать его, пока не
        // будет введён правильный пароль (предположим, что пароль — "1234").
        Scanner scanner2 = new Scanner(System.in);
        String password = "1234";
        String request = scanner2.nextLine();

        do {
            if (!request.equals(password)) {
                request = scanner2.nextLine();
            }
        } while (request.equals(password));
    }

    // 1. Напишите программу, которая запрашивает два числа и выводит их сумму, разность, произведение и частное.
    private static void math(int a, int b) {
        System.out.println(a + b);
        System.out.println(a / b);
        System.out.println(a * b);
        System.out.println(a % b);
    }

    // 2. Создайте программу, которая вычисляет площадь прямоугольника по введённым пользователем длине и ширине.
    private int square(int a, int b) {
        return a * b;
    }

    // 3. Реализуйте программу, которая принимает от пользователя три числа и выводит их среднее арифметическое.
    private int mid(int a, int b, int c) {
        if (a < b && a > c) {
            return a;
        } else if (b < c && b > a) {
            return b;
        } else {
            return c;
        }
    }

    // 4. Напишите программу, которая запрашивает у пользователя число и увеличивает его на 10, выводя результат.
    private int add(int a) {
        return a + 10;
    }

    // 5. Создайте программу, которая меняет значения двух переменных местами с помощью третьей переменной.
    private int[] change(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        return new int[]{a, b};
    }

    // 6. Напишите программу, которая вычисляет квадрат числа, введённого пользователем, и сохраняет результат в новой переменной.
    private int squareCalculation(int a) {
        int result = a * a;
        return result;
    }

    // 7. Напишите программу, которая запрашивает имя и возраст пользователя и выводит приветственное сообщение в формате: "Привет, {имя}, тебe возраст} лет!"
    private void hello(String name, int age) {
        System.out.println("Привет, " + name + ", " + "тебе " + age + " лет!");
    }

    // 8. Создайте программу, которая запрашивает у пользователя стоимость товара и процент скидки, а затем выводит стоимость товара после применения скидки.
    private int discountCalculate(int a, int b) {
        return (a / 100) * b;
    }

    // 9. Напишите программу, которая принимает от пользователя два числа и выводит, какое из них больше, или сообщает, что числа равны.
    private void greaterThan(int a, int b) {
        if (a > b) {
            System.out.println(a + ">" + b);
        } else if (b < a){
            System.out.println(a + "<" + b);
        } else {
            System.out.println(a + "=" + b);
        }
    }

    // 10.Напишите программу, которая принимает на вход число и проверяет, положительное оно, отрицательное или равно нулю.
    private boolean isPositive(int a) {
        if (a < 0)
            return false;
        else
            return true;
    }

    // 11.Создайте программу, которая принимает три числа и выводит наибольшее из них.
    private int sum(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > c && b > a) {
            return b;
        } else {
            return c;
        }
    }

    // 12.Реализуйте программу, которая проверяет, является ли введённое число чётным, и если да, то дополнительно проверяет, делится ли оно на 4
    private boolean isTrue(int a) {
        if (a % 2 == 0)
            if (a % 4 == 0)
                return true;
            else
                return false;
        else
            return false;
    }


    // 13.Напишите программу, которая выводит все числа от 1 до 10 с помощью цикла while.
    private int print() {
        int sum = 0;

        int i = 1;
        while (i <= 10) {
            sum += i;
            i++;
        }

        return sum;
    }

    // 14.Создайте программу, которая принимает на вход число и выводит его таблицу умножения от 1 до 10.
    private void tableMultiplication(int a) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(a * i);
        }
    }

    // // 17.Реализуйте программу, которая выводит числа от 1 до 10, используя цикл с постусловием.
    private void printTen() {
        int i = 0;
        int result = 1;
        do {
            result += i;
            i++;
        } while (i <= 10);
    }

    // 18.Напишите программу, которая выводит все чётные числа от 1 до 20 с помощью цикла for.
    private void printWithFor() {
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    // 19.Создайте программу, которая принимает от пользователя число n и выводит все числа от 1 до n.
    private void printBeforeN(int n ) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

    // 20.Напишите программу, которая вычисляет сумму чисел от 1 до 100 и выводит результат.
    private int sumHundred() {
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            sum += i;
        }

        return sum;
    }
}






















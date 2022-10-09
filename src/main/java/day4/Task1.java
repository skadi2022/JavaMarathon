package day4;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int [] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            Random random = new Random();
            numbers [i] = random.nextInt(10 + 1) +0;
        }

        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        for (int number: numbers) {
            System.out.print(number + " ");

            if (number > 8)
                a++;

            if (number == 1)
                b++;

            if (number % 2 == 0)
                c++;

            if (number % 2 != 0)
                d++;

            e = e + number;
        }
        System.out.println();
        System.out.println("Длина массива: " + n);
        System.out.println("Количестве чисел больше 8: " + a);
        System.out.println("Количестве чисел равных 1: " + b);
        System.out.println("Количестве четных чисел: " + c);
        System.out.println("Количестве нечетных чисел: " + d);
        System.out.println("Сумма всех элементов массива: " + e);
    }
}

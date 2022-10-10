package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        Random random = new Random();

        int [] numbers = new int[arrayLength];

        for (int i = 0; i < numbers.length; i++)
            numbers [i] = random.nextInt(10 +1);

        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int sum = 0;
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

            sum += number;
        }
        System.out.println();
        System.out.println("Длина массива: " + arrayLength);
        System.out.println("Количестве чисел больше 8: " + a);
        System.out.println("Количестве чисел равных 1: " + b);
        System.out.println("Количестве четных чисел: " + c);
        System.out.println("Количестве нечетных чисел: " + d);
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}

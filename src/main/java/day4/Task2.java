package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();

        int [] numbers = new int [100];

        for (int i = 0; i < numbers.length; i++) {
            numbers [i] = random.nextInt(10000);
        }

        int max = numbers [0];
        int min = numbers [0];
        int count = 0;
        int sum = 0;
        for (int number: numbers) {
            System.out.print(number + " ");
            if (number > max)
                max = number;

            if (number < min)
                min = number;

            if (number % 10 == 0) {
                count++;
                sum += number;
            }
        }
        System.out.println();
        System.out.println("наибольший элемент массива: " + max);
        System.out.println("наименьший элемент массива: " + min);
        System.out.println("количество элементов массива, оканчивающихся на 0: " + count);
        System.out.println("сумма элементов массива, оканчивающихся на 0: " + sum);
    }
}

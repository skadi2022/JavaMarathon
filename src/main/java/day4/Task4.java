package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int [] numbers = new int[100];

        for (int i = 0; i < 100; i++) {
            Random random = new Random();
            numbers[i] = random.nextInt(10000 +1) +0;
        }

        int id = 0;
        int sumMax = 0;

        for (int i = 0; i < 98; i++) {
            int sum = 0;
            sum = numbers[i] + numbers[i + 1] + numbers[i + 2];
            if (sum > sumMax) {
                sumMax = sum;
                id = i;
            }
        }
        System.out.println(sumMax);
        System.out.println(id);
    }
}

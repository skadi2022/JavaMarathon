package day4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int [][] numbers = new int[12][8];

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 8; j++) {
                Random random = new Random();
                numbers [i][j] = random.nextInt(50 +1) + 0;
            }
        }

        int id = 0;
        int sumMax = 0;

        for (int i = 0; i < 12; i++) {
            int sumLine = 0;

            for (int j = 0; j < 8; j++) {
                System.out.printf("%2d ", numbers[i][j]);
                sumLine = sumLine + numbers [i][j];
            }
            System.out.println(" - " + sumLine);
            if (sumLine > sumMax) {
                sumMax = sumLine;
                id = i;
            }
        }
        System.out.println();
        System.out.println("Индекс строки, сумма чисел в которой максимальна: " + id);
    }
}

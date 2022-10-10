package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();

        int [][] numbers = new int[12][8];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers [i][j] = random.nextInt(50);
            }
        }

        int idLine = 0;
        int sumMax = 0;

        for (int i = 0; i < numbers.length; i++) {
            int sumLine = 0;

            for (int j = 0; j < numbers[i].length; j++) {
                System.out.printf("%2d ", numbers[i][j]);
                sumLine += numbers [i][j];
            }
            System.out.println(" - " + sumLine);
            if (sumLine >= sumMax) {
                sumMax = sumLine;
                idLine = i;
            }
        }
        System.out.println();
        System.out.println("Индекс строки, сумма чисел в которой максимальна: " + idLine);
    }
}

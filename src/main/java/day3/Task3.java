package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;

        while (i < 5) {
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            i++;

            if (y == 0) {
                System.out.println("Деление на 0");
                continue;
                }

            System.out.println(x / y);
        }
    }
}

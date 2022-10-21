package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file1 = new File("C://Admin/Marathone", "file1.txt");
        PrintWriter pw1 = new PrintWriter(file1);
        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            pw1.print(random.nextInt(100) + " ");
        }
        pw1.close();

        File file2 = new File("C://Admin/Marathone", "file2.txt");
        PrintWriter pw2 = new PrintWriter(file2);
        int counter = 0;
        int sumEvery20 = 0;

        Scanner scanner = new Scanner(file1);
        String line = scanner.nextLine();
        String[] numbers = line.split(" ");

        for (int i = 0; i < numbers.length; i++) {
            sumEvery20 += Integer.parseInt(numbers[i]);
            counter++;

            if (counter == 20) {
                pw2.print(sumEvery20 / 20 + " ");
                sumEvery20 = 0;
                counter = 0;
            }
        }
        pw2.close();

        printResult(file2);
        }

        public static void printResult (File file2) throws FileNotFoundException {
            Scanner scanner = new Scanner(file2);
            String line = scanner.nextLine();
            String[] numbers = line.split(" ");
            double sumFile2 = 0;

            for (int i = 0; i < numbers.length; i++) {
                sumFile2 += Double.parseDouble(numbers[i]);
            }
            System.out.println((int)sumFile2);
    }
}


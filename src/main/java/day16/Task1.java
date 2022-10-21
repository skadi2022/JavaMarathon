package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("numbers.txt");

        printResult(file);
    }

    public static double printResult(File file) {
        int counter = 0;
        double midArif = 0, sumNumbers = 0;
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] lineSeparated = line.split(" ");

            for (String number : lineSeparated) {
                sumNumbers += Integer.parseInt(number);
                counter++;
            } scanner.close();

            midArif = sumNumbers / counter;
            System.out.printf(midArif + " --> " + "%.3f", midArif);

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } return midArif;
    }
}


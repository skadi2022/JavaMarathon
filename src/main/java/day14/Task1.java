package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("numbers.txt");
        printSumDigits(file);
    }

    public static void printSumDigits (File file) {
        int sumNumbers = 0, counter = 0;

        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] lineSeparated = line.split(" ");

            for (String number : lineSeparated) {
                sumNumbers += Integer.parseInt(number);
                counter++;
            } scanner.close();

            if (counter != 10) throw new FileContentsExeption("Invalid input file, amount of numbers < or > 10");
                System.out.println(sumNumbers);
        } catch (FileNotFoundException | FileContentsExeption e) {
            e.printStackTrace();
        }
    }
}



package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileContentsExeption {
        File file = new File("numbers.txt");

        printSumDigits(file);
    }

    public static void printSumDigits (File file) throws FileContentsExeption {
        int sumNumbers = 0, counter = 0;
        int[] numbers = new int[10];

        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] lineSeparated = line.split(" ");

            for (String number : lineSeparated) {
                sumNumbers += numbers[counter] = Integer.parseInt(number);
                counter++;
            } scanner.close();

            if (counter == 10) {
                System.out.println(sumNumbers);
            }
            else throw new FileContentsExeption("Invalid input file, amount of numbers < or > 10");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");

        }
    }
}



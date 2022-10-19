package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileContentsExeption {
        File file = new File("people.txt");
        System.out.println(parseFileToStringList(file));
    }

    public static List<String>parseFileToStringList(File file) throws FileContentsExeption {
        List<String> listOfPeoples = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                listOfPeoples.add(scanner.nextLine());
            } scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

        for (String people : listOfPeoples) {
            if (Integer.parseInt(people.split(" ")[1]) < 0) {
                throw new FileContentsExeption("Invalid input file (age < 0)");
            }
        }
        return listOfPeoples;
    }
}

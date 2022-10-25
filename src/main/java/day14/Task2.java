package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("people.txt");
        System.out.println(parseFileToStringList(file));
    }

    public static List<String> parseFileToStringList(File file) {
        List<String> listOfPeoples = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] person = line.split(" ");

                if (Integer.parseInt(person[1]) < 0)
                    throw new FileContentsExeption("Invalid input file (age < 0)");

                listOfPeoples.add(line);
            } scanner.close();
            return listOfPeoples;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (FileContentsExeption e) {
            e.printStackTrace();
        }
        return null;
    }
}


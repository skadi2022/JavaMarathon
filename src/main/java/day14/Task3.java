package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("people.txt");
        System.out.println(parseFileToObjList(file));
    }

    public static List<Person> parseFileToObjList(File file) {
        List<Person> listOfPeople = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] person = line.split(" ");

                if (Integer.parseInt(person[1]) < 0)
                    throw new FileContentsExeption("Invalid input file (age < 0)");

                listOfPeople.add(new Person(person[0], Integer.parseInt(person[1])));
            } scanner.close();
            return listOfPeople;
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (FileContentsExeption e) {
            e.printStackTrace();
        }
        return null;
    }
}

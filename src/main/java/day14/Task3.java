package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) throws FileContentsExeption {
        File file = new File("people.txt");
        System.out.println(parseFileToObjList(file));
    }

    public static List<Person> parseFileToObjList(File file) throws FileContentsExeption {
        List<String> listOfPeoplesBeforeParsing = new ArrayList<>();
        List<Person> listOfPeoplesAfterParsing = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file).useDelimiter(" ") ;
            while (scanner.hasNextLine()) {
                listOfPeoplesBeforeParsing.add(scanner.nextLine());
            } scanner.close();

            for (String strBeforeParsing : listOfPeoplesBeforeParsing) {
                if (Integer.parseInt(strBeforeParsing.split(" ")[1]) < 0) {
                    throw new FileContentsExeption("Invalid input file (age < 0)");
                }
                listOfPeoplesAfterParsing.add(new Person(strBeforeParsing.split(" ")[0],
                        Integer.parseInt(strBeforeParsing.split(" ")[1])));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        return listOfPeoplesAfterParsing;
    }
}

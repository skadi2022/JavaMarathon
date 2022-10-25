package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){

        File file = new File("src/main/resources/shoes.csv");

        try {
            PrintWriter pw = new PrintWriter("src/main/resources/missing_shoes.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] listShoes = line.split(";");

                if (listShoes.length != 3)
                    throw new IllegalArgumentException("Invalid input file");

                if (Integer.parseInt(listShoes[2]) == 0) {
                        pw.println(line);
                }
            }  pw.close(); scanner.close();
        } catch(FileNotFoundException e){
            e.printStackTrace();
        } catch (IllegalArgumentException e){
            e.printStackTrace();
        }
    }
}

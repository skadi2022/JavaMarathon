package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List <String> list = new ArrayList<>();
        list.add("BMW");
        list.add("Audi");
        list.add("Ford");
        list.add("Honda");
        list.add("Opel");

        System.out.println(list);

        list.add(3,"Toyota");
        list.remove(0);
        System.out.println(list);
    }
}

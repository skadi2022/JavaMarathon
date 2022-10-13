package day8;

public class Task1 {
    public static void main(String[] args) {
        long startTime1 = System.currentTimeMillis();
        String string1 = "";
        for (int i = 0; i <= 20000; i++) {
            string1 += i + " ";
        }
        System.out.println(string1);
        long stopTime1 = System.currentTimeMillis();
        System.out.println("Длительность работы, в мс: " + (stopTime1 - startTime1));

        long startTime2 = System.currentTimeMillis();
        StringBuilder string2 = new StringBuilder();
        for (int j = 0; j <= 20000; j++) {
            string2 = string2.append(j).append(" ");
        }
        System.out.println(string2);
        long stopTime2 = System.currentTimeMillis();
        System.out.println("Длительность работы, в мс: " + (stopTime2 - startTime2));
    }
}

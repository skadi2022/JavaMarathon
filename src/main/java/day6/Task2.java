package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Airbus", 2001, 38, 64400);
        airplane.setYear(2005);
        airplane.setLength(34);
        airplane.fillUp(500);
        airplane.fillUp(300);
        airplane.info();
    }
}

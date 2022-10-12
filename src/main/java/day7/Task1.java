package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Boeing 737", 2020, 31,52400);
        Airplane airplane2 = new Airplane("Boeing 777", 2018,74, 260200);

        Airplane.compareAirplanes(airplane1, airplane2);
    }
}
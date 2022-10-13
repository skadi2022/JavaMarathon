package day7;

public class Airplane {
    private String manufacturer;
    private int year;
    private int length;
    private int weight;

    public Airplane(String manufacturer, int year, int length, int weight) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }

    public int getLength() {
        return length;
    }

    public static void compareAirplanes (Airplane airplane1, Airplane airplane2) {
        if (airplane1.getLength() > airplane2.getLength())
            System.out.println("Первый самолет длиннее");
        else if (airplane1.getLength() < airplane2.getLength())
            System.out.println("Второй самолет длиннее");
        else
            System.out.println("Длины самолетов равны");
    }
}

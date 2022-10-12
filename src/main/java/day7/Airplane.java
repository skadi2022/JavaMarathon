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

    public static void compareAirplanes (Airplane airplane1, Airplane airplane2) {
        int length1 = airplane1.length;
        int length2 = airplane2.length;

        if (length1 > length2)
            System.out.println("Первый самолет длиннее");
        else if (length1 < length2)
            System.out.println("Второй самолет длиннее");
        else
            System.out.println("Длины самолетов равны");
    }
}

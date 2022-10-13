package day8;

public class Airplane {
    private String manufacturer;
    private int year;
    private int length;
    private int weight;
    private int fuel = 0;

    public void setYear(int year) {
        this.year = year;
    }

    public Airplane(String manufacturer, int year, int length, int weight) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }

    public String toString () {
        return "Изготовитель: " + manufacturer + ", год выпуска: " + year
                + ", длина: " + length + ", вес: " + weight + ", количество топлива в баке: " + fuel;
    }
}

package day6;

public class Motorbike {
    private String model;
    private String color;
    private int year;

    public Motorbike (String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public void info () {
        System.out.println("Это мотоцикл");
    }

    public int yearDifference (int inputYear) {
        int yearDiff = Math.abs(inputYear - year);
        return yearDiff;
    }
}
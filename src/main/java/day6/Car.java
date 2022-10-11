package day6;

public class Car {
    private int year;

    public void setYear(int year) {
        this.year = year;
    }

    public void info () {
        System.out.println("Это автомобиль");
    }

    public int yearDifference (int inputYear) {
        int yearDiff = Math.abs(inputYear - year);
        return yearDiff;
    }
}
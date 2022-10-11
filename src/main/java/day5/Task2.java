package day5;

public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike("Audi", "black", 2015);
        System.out.println("model: " + motorbike.getModel() + ", color: " + motorbike.getColor() + ", year: " + motorbike.getYear());
    }
}

class Motorbike {
    private String model;
    private String color;
    private int year;

    public Motorbike (String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }
}
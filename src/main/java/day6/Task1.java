package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYear(2010);
        car.info();
        int yearDiffCar = car.yearDifference(2000);
        System.out.println("Разница между переданным годом и годом выпуска: " + yearDiffCar);

        Motorbike motorbike = new Motorbike("Yamaha", "grey",2015);
        motorbike.info();
        int yearDiffMoto = motorbike.yearDifference(2018);
        System.out.println("Разница между переданным годом и годом выпуска: " + yearDiffMoto);
    }
}

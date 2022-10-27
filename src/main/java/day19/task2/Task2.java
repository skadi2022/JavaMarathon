package day19.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Neil Alishev
 */
public class Task2 {
        public static void main(String[] args) throws FileNotFoundException {
            File file = new File("src/main/resources/taxi_cars.txt");
            Scanner scannerCars = new Scanner(file);

            Map<Integer, Point> map = new HashMap<>();

            while (scannerCars.hasNextLine()) {
                String line = scannerCars.nextLine();
                String[] numbers = line.split(" ");
                int[] arrNumbers = new int[3];

                int i = 0;
                for (String number : numbers) {
                    arrNumbers[i] = Integer.parseInt(number);
                    map.put(arrNumbers[0], new Point(arrNumbers[1], arrNumbers[2]));
                    i++;
                }
            }
            scannerCars.close();

//        for (Map.Entry<Integer, Point> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + " : " + entry.getValue());
//        }

            System.out.println("Введите 4 числа от 0 до 99 (координаты квадрата):");
            Scanner scannerCoordinates = new Scanner(System.in);
            int x1 = scannerCoordinates.nextInt();
            int y1 = scannerCoordinates.nextInt();
            int x2 = scannerCoordinates.nextInt();
            int y2 = scannerCoordinates.nextInt();
            scannerCoordinates.close();

            if (x1 < 0 || x1 > 99 || x2 < 0 || x2 > 99 || y1 < 0 || y1 > 99 || y2 < 0 || y2 > 99) {
                System.out.println("Значения координат находятся вне диапазона от 0 до 99");
            } else {
                int count = 0;
                for (Map.Entry<Integer, Point> entry : map.entrySet()) {
                    Point coordinatesCars = entry.getValue();
                    if ((coordinatesCars.getX() > x1 && coordinatesCars.getX() < x2) &&
                            (coordinatesCars.getY() > y2 && coordinatesCars.getY() < y1)) {
                        System.out.println(entry.getKey());
                        count++;
                    }
                }
                if (count != 0)
                    System.out.println("Количество машин, находящихся в заданных координатах: " + count);
                else
                    System.out.println("В заданных координатах нет машин.");
            }
        }
    }

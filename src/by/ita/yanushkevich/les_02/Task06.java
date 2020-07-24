package by.ita.yanushkevich.les_02;

/*
Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да,
то будет ли он прямоугольным
 */

public class Task06 {
    public static void main(String[] args) {
        int angle1 = 45;
        int angle2 = 45;

        if (angle1 + angle2 < 180) {
            System.out.println("Треугольник с данными углами будет существовать");

            if (angle1 + angle2 == 90 || angle1 == 90 || angle2 == 90) {
                System.out.println("Данный треугольник является прямоугольным");
            }

        } else {
            System.out.println("Треугольника с такими углами не существует");
        }
    }
}
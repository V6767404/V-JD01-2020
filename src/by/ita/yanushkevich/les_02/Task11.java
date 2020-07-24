package by.ita.yanushkevich.les_02;

/*
Вычислить значение функции на отрезке [a, b] с шагом h.
y = x,x > 2 или -x, x <= 2
 */

public class Task11 {
    public static void main(String[] args) {
        double a = 0.2;
        double b = 1.8;
        double h = 0.1;
        double x = a;
        System.out.println("x получит значения :");
        while (x <= b) {
            if (x > 2) {
                System.out.printf( "%f%n" , x);
            } else {
        //     System.out.println(-x);
               System.out.printf( "%f%n" , -x);
            }
            x += h;
        }
    }
}
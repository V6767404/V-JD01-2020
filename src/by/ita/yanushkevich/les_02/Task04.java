package by.ita.yanushkevich.les_02;

/*
Составить программу сравнения двух чисел 1 и 2. Если 1 меньше 2 - вывести на экран цифру 7,
в противном случае - цифру 8.
 */

public class Task04 {
    public static void main(String[] args) {

        int first = 12;
        int second = 11;
        if (first < second) {
            System.out.println(7);
        }
        else{
            System.out.println(8);
        }
    }
}

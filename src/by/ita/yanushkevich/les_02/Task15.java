package by.ita.yanushkevich.les_02;

/*
Найти НОД двух целых положительных чисел
 */
// Алгоритм Евклида работает для целых положительных чисел
//https://habr.com/ru/post/205106/

public class Task15 {
    public static void main(String[] args) {
        int a, a1, b, b1;
        a=a1=64;
        b=b1=12;

        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        System.out.println("НОД чисел" + a1 + " и "+ b1 + " равен " + a );
    }
}

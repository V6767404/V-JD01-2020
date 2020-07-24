package by.ita.yanushkevich.les_02;

/*
Найти НОД двух целых положительных чисел
 */
// Алгоритм Евклида работает для целых положительных чисел
//https://habr.com/ru/post/205106/

/*
Найти НОД двух целых положительных чисел
 */

public class Task15 {
    public static void main(String[] args) {
        int a = 64;
        int b = 12;
        int a1 = a;

        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        System.out.println("НОД чисел" + a1 + " и " + b + " равен " + a);
    }
}

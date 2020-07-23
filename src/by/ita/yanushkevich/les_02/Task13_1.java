package by.ita.yanushkevich.les_02;

/*
Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует все числа от 1 до
введенного пользоваьелем числа.
 */

import java.util.Scanner;

public class Task13_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int variable = -1;
        int result = 0;

        //проверка ввода
        while (variable < 0) { // если введен символ -будет exception
            System.out.println("Введите любое целое цисло:");
            variable = sc.nextInt();
        }

        for (int i = 1; i <= variable; i++) {
            result = result + i; // result += i;
        }

        System.out.println("Сумма чисел от 1 до введеного числа равна:");
        System.out.println(result);
    }
}



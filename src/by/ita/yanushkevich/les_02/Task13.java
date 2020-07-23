package by.ita.yanushkevich.les_02;

/*
Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует все числа от 1 до
введенного пользоваьелем числа.
 */

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {
        System.out.println("Введите любое целое цисло:");
        Scanner sc = new Scanner(System.in);
        int variable;
        int result = 0;
        variable = sc.nextInt();
        for(int i = variable; i > 0; i--){
            result += i;
        }
        System.out.println("Сумма чисел от 1 до введеного числа равна:");
        System.out.println(result);
    }
}

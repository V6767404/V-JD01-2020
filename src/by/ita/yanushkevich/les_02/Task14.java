package by.ita.yanushkevich.les_02;

/*
Требуется определить факториал числа, которое ввел пользователь.
 */
//Таблица факториалов
//https://scolaire.ru/tablica_faktorialov.php
//при значении variable>20 уже не хватает лонга

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        System.out.println("Введите любое целое цисло до 20:");
        Scanner sc = new Scanner(System.in);
        int variable;
        variable = sc.nextInt();
        long factorial = 1; // при значении variable>20 уже не хватает лонга !!
        for(int i = variable; i > 0; i--){
            factorial *= i;
        }
        System.out.println("факториал " + variable + " равен " + factorial) ;

    }
}
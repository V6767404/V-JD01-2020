package by.ita.yanushkevich.les_03;

/*
Даны действительные числа а1, а2 ... аn. Поменять местами наибольший и наименьший элемент.
 */

import java.util.Random;

public class Task07_1 {
    public static void main(String[] args) {

        int[] array = {1, 55, 0, 3, 7, 9, -44, 10};

        //печатаем массив
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        //ищем индексы минимального и максимального элементов
        int max = array[0];
        int min = array[0];
        int maxpointer = 0;
        int minpointer = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxpointer = i;
            }
            if (array[i] < min) {
                min = array[i];
                minpointer = i;
            }
        }

        System.out.println("наибольший элемент массива: " + max + " расположен под индексом " + maxpointer);
        System.out.println("наименьший элемент массива: " + min + " расположен под индексом " + minpointer);
        System.out.println("меняем местами наибольший и наименьший элемент:");

        //меняем местами элементы
        int helper;

        helper = array[minpointer];
        array[minpointer] = array[maxpointer];
        array[maxpointer] = helper;

        //печатаем получившейся массив
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

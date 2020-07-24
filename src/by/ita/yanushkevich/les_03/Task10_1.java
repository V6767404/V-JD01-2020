package by.ita.yanushkevich.les_03;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class Task10_1 {

    public static void main(String[] args) {
        Random rn = new Random();
        int[] array = new int[10];

        //заполняем массив случайными элементами
        for (int i = 0; i < array.length; i++) {
            array[i] = rn.nextInt(100);
        }

        //печатаем массив
        System.out.print("Наш массив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();


        int max = 0;
        int sum = 0;

        for (int i = 0; i < array.length / 2; i++) {

            sum = array[i] + array[array.length - 1 - i];

            if (max < sum) {
                max = sum;
            }

        }
        System.out.println("максимальная сумма элементов выполняющих условие задания " + max);

    }
}


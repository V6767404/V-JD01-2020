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

//        int last = array.length - 1;
        int max = 0;

        for (int i = 0; i < array.length/2; i++) {
//            System.out.print(i + " ");
//            System.out.println(last + " ");
            if (max < array[i] + array[array.length-1-i]) {
                max = array[i] + array[array.length-1-i];
            }
 //            last--;
        }
        System.out.println("максимальная сумма элементов выполняющих условие задания " + max);

    }
}


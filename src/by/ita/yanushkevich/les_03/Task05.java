package by.ita.yanushkevich.les_03;

/*
Дана числовая последовательность а1, а2 ... аn. Указать наименьшую длину числовой оси, содержащую все эти числа.
 */

import java.util.Random;

public class Task05 {
    public static void main(String[] args) {
        Random rn = new Random();
        int[] array = new int[10];
        int min = 999;
        int max = 0;

        //заполняем массив случайными элементами
        for (int i = 0; i < array.length; i++) {
            array[i] = rn.nextInt(1000);
        }

        //печатаем массив
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        for (int i = 0; i < array.length; i++) {

            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println();
        System.out.println("Наименьшая длина числовой оси " + (max - min));
    }
}

// вообщем ок, но не учел что числа могут быть отрицательными
// длинна числовой оси это разница между максимальным и минимальным числом (в том числе и отрицательным)
// Либо покугли как рандомом сделать генерацию положительных и отрицательных в диапозоне либо задай вручную


package by.ita.yanushkevich.les_03;

/*
Дана числовая последовательность а1, а2 ... аn. Указать наименьшую длину числовой оси, содержащую все эти числа.
 */


import java.util.Random;

public class Task05_1 {
    public static void main(String[] args) {
        int[] array = {1, 55, 0, 3, 7, 9, -44, 10};

       //печатаем массив
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        int max = array[0];
        int min = array[0];

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

//    int [] mas = {10, -3, 0, 3, 7, 9, 0, 20};
//    тут длинна должна быть =23
//    Прога должна содержать алгоритм нахождения минимального и максимального значения массива
//    а потом от максимума отнять минимум и все/
//    По сути у тебя этот алгоритм нахождения минимума и максимума хорошо сделан в Task07
package by.ita.yanushkevich.les_04;

//11.Матрицу 10x20 заполнить случайными числами от 0 до 15.
//   Вывести на экран саму матрицу и номера строк, в
//   которых число 5 встречается три и более раз.

// (int)(Math.random()*(max - min + 1) + min)  // работает в положительном и отрицательном диапозоне [min;max]
// System.out.println((int) (Math.random() * 6) - 3); // [-3;2]

public class Task11 {

    public static void main(String[] args) {

        int[][] mas = new int[10][20];
        // заполним двумерный массив случайными числами

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = (int) (Math.random() * 16); // [0;15]
            }
        }
        // вывод массива

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.print(mas[i][j] + "\t");
            }
            System.out.println();
        }

        // задание - посчитать количество 5-рок в каждой строке и
        // вывести на экран номера тех строк где 5-рок больше двух

        int counter;

        for (int i = 0; i < mas.length; i++) {
            counter = 0;
            for (int j = 0; j < mas[i].length; j++) {
                if (mas[i][j] == 5)
                    counter++;
            }
            if (counter > 2) {
                System.out.println("Строка # " + i + " содержит 5-рок больше двух");
            }
        }
    }
}


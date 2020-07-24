package by.ita.yanushkevich.les_04;

/*
Дана матрица. Вывести k-ю стриоку и p-й столбец матрицы.
 */
public class Task02 {
    public static void main(String[] args) {

        int k = 2; //  строка
        int p = 1; // столбец

        // создаем двумерный массив из случайных чисел из отрезка [10;99]
        int[][] mas = new int[4][6];

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = (int) (Math.random() * 90 + 10);
            }
        }

        // вывод массива
        System.out.println("Исходный массив :");
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.print(mas[i][j] + "\t");
            }
            System.out.println();
        }
        // mas[n,m] - n - строка m -столбец
        // mas.length так находиться количичество строк
        // mas[0].length так находиться количичество столбцов

        System.out.println("элемент mas[0][4] = " + mas[0][4]);

        // задание
        System.out.println("Элементы строки под номером " + k);
        for (int i = 0; i < mas[0].length; i++) { // mas[0].length так находиться количичество столбцов
            System.out.print(mas[k][i] + "\t");
        }
        System.out.println();

        System.out.println("Элементы столбца под номером " + p);
        for (int i = 0; i < mas.length; i++) { // mas.length так находиться количичество строк
            System.out.println(mas[i][p] + "\t");
        }
    }
}


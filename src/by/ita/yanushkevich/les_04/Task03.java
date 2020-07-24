package by.ita.yanushkevich.les_04;

/*
3. Дана матрица размера m x n. Вывести ее элементы в следующем порядке: первая строка справа налево, вторая
        строка слева направо, третья строка справа налево и так далее.
        */

public class Task03 {
    public static void main(String[] args) {
        int[][] mas =
                       {{10, 11, 12, 13, 14},
                        {15, 16, 17, 18, 19},
                        {20, 21, 22, 23, 24},
                        {25, 26, 27, 28, 29},
                        {30, 31, 32, 33, 34}};


        System.out.println("------------------");

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.print(mas[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("------------------");

        for (int i = 0; i < mas.length; i++) {

            if (i % 2 == 0) {
                for (int j = 0; j < mas[i].length; j++) {
                    System.out.print(mas[i][j] + "\t");
                }
            } else {
                for (int j = mas[i].length - 1; j > -1; j--) {
                    System.out.print(mas[i][j] + "\t");
                }
            }
            System.out.println();
        }
        System.out.println("------------------");
    }
}

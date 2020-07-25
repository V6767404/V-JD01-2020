package by.ita.yanushkevich.les_04;

//12. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
//    единиц равно номеру столбца.

// ЗАДАЧА ПОКА НЕ РЕШЕНА !!!!!!!!!!!

public class Task12 {
    public static void main(String[] args) {

        int[][] mas = new int[7][5];

        for (int j = 0; j < mas.length; j++) {

            mas[j][0] = 5;
            mas[j][mas[0].length-1] = 1;

        }

        // вывод массива

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.print(mas[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

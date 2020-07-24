package by.ita.yanushkevich.les_04;

// Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
// 1, 2, 3,   ..., n
// n, n-1, n-2, .. 1
// 1, 2, 3,   ..., n
// n, n-1, n-2, .. 1
// ..
// n, n-1, n-2, .. 1

public class Task04 {
    public static void main(String[] args) {

        int n = 6;
        int[][] mas = new int[n][n];

        for (int i = 0; i < mas.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < mas[i].length; j++) {
                    mas[i][j] = j+1;
                }
            } else {
                for (int j = 0; j < mas[i].length; j++) {
                    mas[i][j] = mas[i].length - j;
                }
            }
        }

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.print(mas[i][j] + "\t");
            }
            System.out.println();

        }
    }
}

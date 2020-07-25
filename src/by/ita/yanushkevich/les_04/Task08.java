package by.ita.yanushkevich.les_04;

// Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
// 1   2   3  ..  n-2 n-1 n
// 2   3   4  ..  n-1  n  0
// 3   4   5  ..   n   0  0
// ...
// n-1 n  0  ..    0   0  0
// n   0  0  ..    0   0  0

public class Task08 {
    public static void main(String[] args) {

        int n = 6;
        int[][] mas = new int[n][n];

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (j < mas.length - i)
                    mas[i][j] = j + 1 + i;
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
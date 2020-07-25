package by.ita.yanushkevich.les_04;

// Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
// 0  0  0  ..  0  0  1
// 0  0  0  ..  0  2  0
// 0  0  0  ..  3  0  0
// ...
// 0 n-1 0  ..  0  0  0
// n  0  0  ..  0  0  0

public class Task05 {
    public static void main(String[] args) {

        int n = 6;
        int[][] mas = new int[n][n]; // по умолчанию все элементы ноыого массива заполнены нулями

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (j == mas[i].length - 1 - i)
                    mas[i][j] = i + 1;
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

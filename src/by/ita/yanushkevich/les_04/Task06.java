package by.ita.yanushkevich.les_04;

// Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
// 1  1  1  ..  1  1  1
// 1  0  0  ..  0  0  1
// 1  0  0  ..  0  0  1
// ...
// 1  0  0  ..  0  0  1
// 1  1  1  ..  1  1  1

public class Task06 {
    public static void main(String[] args) {

        int n = 6;
        int[][] mas = new int[n][n]; // по умолчанию все элементы ноыого массива заполнены нулями

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (j == 0 || i == 0 || j == mas[i].length - 1 || i == mas[i].length - 1)
                    mas[i][j] = 1;
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
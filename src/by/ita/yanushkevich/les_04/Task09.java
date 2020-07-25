package by.ita.yanushkevich.les_04;

// 9. Дан линейный массив x1, x2,... , xn−1, xn . Получить действительную квадратную матрицу порядка n:
// x1,    x2, ...   , xn−1,    xn
// x1^2,  x2^2, ... , xn−1^2,  xn^2
// x1^3,  x2^3, ... , xn−1^3,  xn^3
// ...
// x1^n,  x2^n, ... , xn−1^n,  xn^n

public class Task09 {
    public static void main(String[] args) {

        int[] masA = {1, 2, 3, 4, 5};

        int n = masA.length;
        int[][] mas = new int[n][n];

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = (int) Math.pow(masA[j], i + 1);
            }
        }

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.printf("%10d", mas[i][j]);
            }
            System.out.println();
        }
    }
}
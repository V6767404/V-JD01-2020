package by.ita.yanushkevich.les_04;

// сфорировать двумерный массив заполненный нулями и вывести на экран

public class Task01_1 {
    public static void main(String[] args) {

        int n = 6;
        int[][] mas = new int[n][n];

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = 0;
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

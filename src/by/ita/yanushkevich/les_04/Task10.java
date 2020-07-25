package by.ita.yanushkevich.les_04;

//10. Найти положительные элементы главной диагонали квадратной матрицы

//Главной диагональю прямоугольной матрицы является диагональ, которая начинается в верхнем левом углу матрицы
//и изменяется вниз и вправо, пока не будет достигнут правый или нижний край матрицы

public class Task10 {
    public static void main(String[] args) {


        int[][] mas =
                       {{10, 11, 12, 13, -3},
                        {15, -2, 17, 18, 19},
                        {20, 21, 22, 23, 24},
                        {25, -4, 27, -5, 29}};

        //здесь главная диагональ 10 -2 22 -5

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.print(mas[i][j] + "\t\t");
            }
           System.out.println();
        }
        System.out.println();

        // решение в лоб перебором всех элементов матрицы

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (i == j && mas[i][j] > 0)
                    System.out.print(mas[i][j] + "  ");
            }
        }
        System.out.println();

        // решение оптимизированное - следуем только по элементам диагонали
        // длинна диагонали будет ограничена размером минимальной стороны матрицы
        int n = mas.length;
        if (n > mas[0].length) n = mas[0].length;

        for (int i = 0; i < n; i++) {
            if (mas[i][i] > 0)
                System.out.print(mas[i][i] + "  ");
        }
    }
}

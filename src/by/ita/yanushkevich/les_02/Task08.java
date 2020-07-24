package by.ita.yanushkevich.les_02;
/*https://www.cyberforum.ru/csharp-beginners/thread1022073.html
        https://znanija.com/task/18882969*/

/*
Заданы размеры A, B прямоугольного отверстия и размеры x, y, z кирпича. Определить, пройдет ли кирпич через отверстие.
 */

public class Task08 {
    public static void main(String[] args) {

        int A = 3;
        int B = 15;

        int a = 14;
        int b = 9;
        int c = 7;

        if (((A > a) & (B > b)) || ((A > a) & (B > c)) || ((A > c) & (B > b))) {
            System.out.println("Кирпич пройдет");
        } else {
            System.out.println("Кирпич не пройдет");
        }
    }
}
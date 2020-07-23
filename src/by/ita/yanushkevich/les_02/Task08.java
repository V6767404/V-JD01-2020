package by.ita.yanushkevich.les_02;
/*https://www.cyberforum.ru/csharp-beginners/thread1022073.html
        https://znanija.com/task/18882969*/

/*
Заданы размеры A, B прямоугольного отверстия и размеры x, y, z кирпича. Определить, пройдет ли кирпич через отверстие.
 */

public class Task08 {
    public static void main(String[] args) {

        int A = 10;
        int B = 15;
        int a = 12;
        int b = 10;
        int c = 15;

        if(A >= a){
            if(B >= b){
                System.out.println("Кирпич пройдет");

            }
            else if(B >= c){
                System.out.println("Кирпич пройдет");

            }
            else{
                System.out.println("Кирпич не пройдет");

            }
        }
        if(A >= b){
            if(B >= a){
                System.out.println("Кирпич пройдет");

            }
            else if(B >= c){
                System.out.println("Кирпич пройдет");

            }
            else{
                System.out.println("Кирпич не пройдет");

            }
        }
        if(A >= c){
            if(B >= b){
                System.out.println("Кирпич пройдет");

            }
            else if(B >= a){
                System.out.println("Кирпич пройдет");

            }
            else{
                System.out.println("Кирпич не пройдет");

            }
        }
    }
}
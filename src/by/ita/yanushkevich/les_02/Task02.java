package by.ita.yanushkevich.les_02;

/*Вычислить значение выражения по формуле (все пернеменные принимают действительные значения):
(a/c) * (b/d) - (a*b - c) / c*d)
 */

public class Task02 {
    public static void main(String args []){
        double a = 15;
        double b = 2;
        double c = 4;
        double d = 100;
        double result;
        result = (a/c) * (b/d) - (a*b - c) / (c*d);
        System.out.printf("%f" , result);
    }
}

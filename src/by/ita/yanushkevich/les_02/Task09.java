package by.ita.yanushkevich.les_02;

/*
Вычислить значение функции:
x^2 - 3*x + 9, если x <= 3
1 / (x^3 + 6), если x > 3
 */

public class Task09 {
    public static void main(String[] args) {
        int x = 3;
        double result = 0;
        if(x <= 3){
            result = Math.pow(x, 2) - 3*x + 9;
        }

        if(x > 3){
            result = 1 / (Math.pow(x, 3) + 6);
        }
        System.out.println(result);

    }
}
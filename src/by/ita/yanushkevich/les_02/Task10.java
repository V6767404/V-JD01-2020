package by.ita.yanushkevich.les_02;

/*
С помощью оператора while напишите программу вывода всехчетных чисел в диапазоне от 2 до 100 включительно
 */

public class Task10 {
    public static void main(String[] args) {
        int a = 2;
        while (a < 102){
            System.out.print(a + " ");
            a = a + 2;
        }
    }
}
package by.ita.yanushkevich.les_02;

public class Task05_1 {
    public static void main(String[] args) {
        int first = 25;
        int second = 40;

        if (first > second) {
            System.out.println("Второе число меньше");
        } else {
            if (first < second) {
                System.out.println("Первое число меньше");
            } else {
                System.out.println("Числа равны");
            }
        }
    }
}
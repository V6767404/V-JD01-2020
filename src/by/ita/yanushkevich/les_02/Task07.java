package by.ita.yanushkevich.les_02;

/*
Подсчитать количество отрицательных среди чисел a, b, c.
 */

public class Task07 {
    public static void main(String[] args) {
        int a = 8;
        int b = 9;
        int c = 7;
        int counter = 0;

        if(a < 0){
            counter++;
        }
        if(b < 0){
            counter++;
        }
        if(c < 0){
            counter++;
        }
        System.out.println("среди трех чисел " + counter + " отрицательных чисел");
/*        switch (counter) {
            case (1):
                System.out.println("одно отрицательное число из трех");
                break;
            case (2):
                System.out.println("два отрицательных числа из трех");
                break;

            case (3):
                System.out.println("три отрицательных числа из трех");
                break;
            default:
                System.out.println("нет отрицательных чисел");
                break;
        }*/

    }
}

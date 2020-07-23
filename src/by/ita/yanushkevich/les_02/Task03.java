package by.ita.yanushkevich.les_02;

/*
Дана величина А, выражающая объем информации в байтах. Перевести А в более крупные единицы измерения информации.
 */

// https://www.dmosk.ru/instruktions.php?object=kbites
// 1 килобайт = 1024 байта
// 1 мегабайт = 1024 килобайта = 1024 x 1024 байта
// 1 гигабайт = 1024 мегабайта = 1024 x 1024 x 1024 байта

public class Task03 {
    public static void main(String[] args) {

        double a = 100000;
        double kb = Math.pow(2, 10);
        double mb = Math.pow(2, 20);
        double gb = Math.pow(2, 30);

//        System.out.printf("%f %f %f", kb, mb, gb);
//        System.out.println();

        System.out.println(a + " байт = " + a / kb + " килобайт");
        System.out.println(a + " байт = " + a / mb + " мегобайт");
        System.out.println(a + " байт = " + a / gb + " гигобайт");

    }
}
package by.ita.yanushkevich.les_06;
// Lesson_06 Чаcть_01 стравнение строк . Пул литералов 0m 00 - 40m 00
//https://youtu.be/d6WuEw19sHg?list=PLZ49j3s2FXoxpI_SrSMv-ScY2eYpnsQrk&t=1575

public class Les06Theme01 {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Java";
        String str3 = new String ("Java");
        System.out.println("-----1");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1 == str3); // сслыки разные
        System.out.println(str1.equals(str3));
        System.out.println("-----2");
        str3 = str3.intern(); // https://youtu.be/d6WuEw19sHg?list=PLZ49j3s2FXoxpI_SrSMv-ScY2eYpnsQrk&t=1673
        System.out.println(str1 == str3); //ссылки стали ссылаться на один объект т.е. равны
        System.out.println(str1.equals(str3));

        // какой ссмысл размещать строку в пул литералов .intern() ??

        System.out.println("-----3");

        String str5 = str2 + ""; //создасться новый объект
        System.out.println(str5 == str2); //false
        String str6 = str2.concat(""); //новый объект не создастся // https://youtu.be/d6WuEw19sHg?list=PLZ49j3s2FXoxpI_SrSMv-ScY2eYpnsQrk&t=2084

        System.out.println(str6 == str2); //true
        System.out.println("-----4");
        String str7 = "Java14";
        String str8 = "Java" + "14";
        System.out.println(str7 == str8 ); //true потому что складывались константы




    }
}

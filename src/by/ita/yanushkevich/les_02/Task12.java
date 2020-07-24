package by.ita.yanushkevich.les_02;

/*
Вывести на экран соответствий между символами и их численными обозначениями в
памяти компьютера (Таблицу ASCII)
 */
//https://www.w3schools.com/charsets/ref_html_ascii.asp#:~:text=ASCII%20is%20a%207%2Dbit,are%20all%20based%20on%20ASCII

public class Task12 {

    public static void main(String[] args) {
//        char simbol = '#';
//        System.out.println(simbol);
//        System.out.println((int)simbol);

        String str = " !@#$%^&*()+-";
        for(int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i) + " ASCII " + (int) str.charAt(i));
        }
    }
}


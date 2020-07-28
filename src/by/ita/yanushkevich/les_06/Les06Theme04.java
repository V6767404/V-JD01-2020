package by.ita.yanushkevich.les_06;
// рекурcия и Stackoverflow
// https://youtu.be/d6WuEw19sHg?list=PLZ49j3s2FXoxpI_SrSMv-ScY2eYpnsQrk&t=4723

public class Les06Theme04 {
    public static void main(String[] args) {
        m();
    }

    public static void m() {
        System.out.println("!!!!"); //рекурсия и Stackoverflow
        m();

    }
}

package by.ita.yanushkevich.les_06;
//Lesson_06 Thene03 Stack
//        https://youtu.be/d6WuEw19sHg?list=PLZ49j3s2FXoxpI_SrSMv-ScY2eYpnsQrk&t=4554

public class Les06Theme03 {
    public static void main(String[] args) {
        b();
    }

    public static void a() {
        System.out.println("a");
    }

    public static void b() {
        System.out.println("b1");
        a();
        System.out.println("b2");
        c();
    }

    public static void c() {
        System.out.println("c");
    }
}

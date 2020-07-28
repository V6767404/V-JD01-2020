// Lesson_06 Часть2 процедурная декомпиляция -  - создание других методов кроме main и передача в них параметров
//   https://www.youtube.com/watch?v=d6WuEw19sHg&t=2490s

package by.ita.yanushkevich.les_06;

public class Les06Theme02 {

    public static void main(String[] args) {

        int x = 2;
        int y = 10;
        calcNod(x, y); // x y - фвктические парметры

        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }

    public static void calcNod(int a, int b) { // a и b формальные парметры.
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        a++;
        b--;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}

// Все авраметры в Java передаются в методы по значению !!!
// Изменение формального парметра не  приводит к изменинию фактического
// https://youtu.be/d6WuEw19sHg?list=PLZ49j3s2FXoxpI_SrSMv-ScY2eYpnsQrk&t=3440
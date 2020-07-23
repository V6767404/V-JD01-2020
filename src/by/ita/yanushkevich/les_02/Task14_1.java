package by.ita.yanushkevich.les_02;
//Организуйте бесконечный цикл вычисляющий факториал числа
//введенного с клавиатуры. Выход из цикла с помощью break

public class Task14_1 {


        public static void main(String[] args) {

            int n = 20; // введеное значение факториала
            // при значении n>20 уже не хватает лонга

            long calc = 1;
            int i = 1;

            while (true) {
                i++;
                calc = calc * i;
                System.out.println(calc + " факториал " + i);
                if (i == n) {
                    break;
                }

            }

        }

    }

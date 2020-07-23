package by.ita.yanushkevich.les_03;
//        тут работает верно, но несколько избыточен алгоритм
//        нет смысла счиать счетчик сколько раз нарушается последовальность роста - достаточно первого совпадения проверки
//        Можно сделать например так:

public class Task03_1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 1, 7, 8, 9};
        String a = "Данная последовательность является возрастающей";

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < array.length-1; i++) {
            if (array[i + 1] < array[i]) {
                a = "Данная последовательность НЕ является возрастающей";
                break;
            }
        }

        System.out.println(a);
    }
}

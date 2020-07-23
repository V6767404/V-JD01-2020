package by.ita.yanushkevich.les_03;


public class Task03_2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 1, 4, 5, 6, 7, 8, 9};
        boolean flag = true;

        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + " ");
            if (array[i + 1] < array[i]) {
                flag = false;
            }
        }

        if (flag) {
            System.out.println();
            System.out.println("Данная последовательность является возрастающей");
        } else {
            System.out.println();
            System.out.println("Данная последовательность НЕ является возрастающей");
        }
    }
}


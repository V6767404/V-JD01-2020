package by.ita.yanushkevich.les_03;

/*
В целочисленной последовательности есть нулевые элементы. Создать масси из номеров этих элементов.
 */

public class Task02 {
    public static void main(String[] args) {
        int [] sequence = {1, 3, 0, 3, 7, 9, 0, 10};
        int zerocounter = 0;

        //печатаем массив
        System.out.print("Исходный массив: ");
        for(int i = 0; i < sequence.length; i++){
            System.out.print (sequence[i] + "\t");
        }
        System.out.println();

        //ищем количество нулей для определения размера массива
        for (int i = 0; i < sequence.length; i++){
            if(sequence[i] == 0){
                zerocounter++;
            }
        }

        //создаем массив с индексами нулевых элементов
        if(zerocounter != 0){
            System.out.print("Искомый массив:  ");
            int [] array = new int[zerocounter];
            int mark = 0;
            for (int i = 0; i < sequence.length; i++){
                if(sequence[i] == 0){
                    array[mark] = i;
                    System.out.print(array[mark] + "\t");
                    mark++;

                }
            }
        }else{

            System.out.println();
            System.out.println("В последовательности нет нулей");
        }

    }
}

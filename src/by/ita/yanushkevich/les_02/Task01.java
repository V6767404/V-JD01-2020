package by.ita.yanushkevich.les_02;
//Slides https://drive.google.com/file/d/12c37budwwRgRsN121H7P7GFwb7ZZR8dw/view?usp=sharing
//TASKs https://drive.google.com/file/d/1h2OuoPpcdA3icqFzIPin4oHCPZ0o_hen/view?usp=sharing

// Вычислить значение выражения по формуле (все пернеменные принимают действительные значения):
// (b + sqrt(b^2 + 4*a*c)) / 2a - a^3*c + b^(-2)

//Ctrl+/ или Ctrl+Alt+L - ырщкесге for comment
//Ctrl+Alt+L -code allignment

public class Task01 {
    public static void main(String[] args) {
        double b = 10;
        double a = 10;
        double c = 10;
        double result;

        result = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
        System.out.println(result);
        System.out.printf("%f" , result); //стандартный вывод шесть знаков после запятой
        System.out.println();
        System.out.printf("%.3f%n" , result); //вывод с округлением 3 знаков после запятой, %n - перевод строки на новую
        System.out.printf("[%-10.3f]%n" , result); //дополнительно рамка вывода и выравнивание по левому краю
        System.out.printf("[%f] %f" , result, a);
       // printf ()  https://www.codeflow.site/ru/article/java-printstream-printf
    }

}
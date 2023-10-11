import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // F = C * 1.8 + 32
        System.out.println("Конвертер температур");
        System.out.println("Введите градусы цельсии");

        double tt = new Scanner(System.in).nextDouble();
        int tu = 32;
        double tt2 = 1.8;
        System.out.println(tt + " градуса по цельсию это " + (tt * tt2 + tu) + " градусов по фарингейту");
    }
}
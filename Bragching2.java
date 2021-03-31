package ClassWork3;

import java.util.Random;

public class Bragching2 {
    public static void main(String[] args) {
        Random rnd = new Random();

        int a = rnd.nextInt(20);
        int b = rnd.nextInt(20);

        System.out.println("a=" + a);
        System.out.println("b=" + b);

        if (a % 2 == 0 && b % 2 == 0) {
            System.out.println("Два числа не могут быть четные одновременно");
        } else if (a % 2 != 0 && b % 2 != 0) {
            System.out.println("Два числа не могут быть нечетными одновременно");
        } else     if (a % 2 !=0) {
            System.out.print(a);
        } else {
            System.out.println(b);
        }
    }
}

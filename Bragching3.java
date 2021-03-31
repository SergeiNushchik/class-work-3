package ClassWork3;

import java.util.Random;

public class Bragching3 {
    public static void main(String[] args) {
        Random rnd = new Random();

        int a = rnd.nextInt(20);
        int b = rnd.nextInt(20);
        int c = rnd.nextInt(20);

        System.out.print("a=" + a);
        System.out.print("  b=" + b);
        System.out.println("  c=" + c);


        if ((a == b) | (b == c) | (a == c) ){
            System.out.println("УПС....числа не должны быть равными между собой!");
        } else if ((a > b && a < c) | (a < b && a > c) ) {
            System.out.println(a);
        } else if ((b > a && b < c) | (b < a && b > c)) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }

    }
}

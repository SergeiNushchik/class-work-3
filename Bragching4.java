package ClassWork3;

import java.util.Random;
import java.util.Scanner;

public class Bragching4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число которое нужно разделить");
        int a = in.nextInt();
        System.out.println("Введите число на которое нужно разделить");
        int b = in.nextInt();

        System.out.println("a=" + a);
        System.out.println("b=" + b);
        if ((a == 0) |(b == 0)){
            System.out.println("Упс... 0 (ноль) не допустимое число!!!");
        }else  if (a % b == 0) {
            System.out.println( a + " делиться на " + b);
            System.out.println("Частное: " +a/b);
        } else  {
            System.out.println("Остаток от деления: " +a % b);
            System.out.println("Частное: " +a/b);
        }
    }
}

package ClassWork3;

import java.util.Scanner;

public class Bragching7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите год");
        int year = in.nextInt();
            if (year % 4 != 0){
                System.out.println("Обычный");
            } else if (year % 100 == 0) {
                if (year % 400 == 0){
                    System.out.println("Високосный");
                }else {
                    System.out.println("Обычный");
                }
            } else {
                System.out.println("Високосный");
            }

    }
}


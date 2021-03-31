package ClassWork3;

import java.util.Scanner;

public class Bragching6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите символ");
        int num = in.nextInt();

            if ((num > 65 && num < 90) | (num > 97 && num < 122)){
                System.out.println("Это буква английского языка: " +(char)num );
            }  else {
                System.out.println("Это не буква, а символ: " + (char)num);
            }
                }
    }


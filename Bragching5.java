package ClassWork3;

import java.util.Scanner;

public class Bragching5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число подлежащее переводу");
        int number = in.nextInt();
        System.out.println("Выберите систему исчесления: \n b - байты \n k - килобайты");
        String type = in.next();

        switch (type){
            case "b":
                System.out.println(number*1024);
                break;
            case "k":
                System.out.println(number/1024);
                break;
            default:
                System.out.println("Упс...не верно выбранна система исчечления");
        }






        }
    }


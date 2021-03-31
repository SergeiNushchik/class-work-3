package ClassWork3;

import java.util.Random;

public class Bragching {
    public static void main(String[] args) {
        Random rnd = new Random();

        int a = rnd.nextInt(20);
        int b = rnd.nextInt(20);

        System.out.println("a=" + a);
        System.out.println("b=" + b);

        int answerCode = checkCorrektData(a,b);
        switch (answerCode) {
            case 1:
                System.out.println("Два числа не могут быть четные одновременно");
                break;
            case 2:
                System.out.println("Два числа не могут быть нечетными одновременно");
                break;
        }

        if(answerCode == 0){
            System.out.println(getOddNumber(a, b));
        }
    }

    /***
     * Данный метода проверяет на корректность
     * @param c число
     * @param j число
     * @return 0 если все хорошо, иначе все плохо
     */

    public static int checkCorrektData(int c, int j) {
        boolean checkC = c % 2 == 0;
        boolean checkJ = j % 2 == 0;
        if(checkC && checkJ ){
            return 1;

        }else if(!checkC && !checkJ){
            return 2;

        }
        return 0;
    }

    /***
     * Метод который нахродит нечетное число
     * @param var1 число
     * @param var2 число
     * @return
     */

    public static int getOddNumber(int var1, int var2) {
        if (var1 % 2 != 0) {
            return var1;
        } else {
            return var2;
        }
    }
}

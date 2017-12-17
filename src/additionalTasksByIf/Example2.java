package additionalTasksByIf;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        int number1;
        int number2;
        int number3;
        int number4;

        Scanner in = new Scanner(System.in);

        System.out.println("Введите number1 :  ");
        number1 = in.nextInt();
        System.out.println("Введите number2 : ");
        number2 = in.nextInt();
        System.out.println("Введите number3 : ");
        number3 = in.nextInt();
        System.out.println("Введите number4 : ");
        number4 = in.nextInt();
        System.out.println(Math.max(Math.max(number1, number2), Math.max(number3, number4)));
    }
}

package additionalTasksByIf;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        int number1;
        int number2;
        int number3;
        int number4;

        Scanner in = new Scanner(System.in);

        System.out.println("Введите a: ");
        number1 = in.nextInt();
        System.out.println("Введите b: ");
        number2 = in.nextInt();
        System.out.println("Введите c: ");
        number3 = in.nextInt();
        System.out.println("Введите d: ");
        number4 = in.nextInt();

        if ((number1 < number2) && (number1 < number3) && (number1 < number4)) {
            System.out.println(" a - наименьшее");
        } else if ((number2 < number1) && (number2 < number3) && (number2 < number4)) {
            System.out.println(" b  - наименьшее");
        } else if ((number3 < number1) && (number3 < number2) && (number3 < number4)) {
            System.out.println(" c  - наименьшее");
        } else if ((number4 < number1) && (number4 < number2) && (number4 < number3)) {
            System.out.println(" d   наименьшее");
        }

    }
}

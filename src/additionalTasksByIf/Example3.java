package additionalTasksByIf;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner((System.in));
        int number1 = in.nextInt();
        int number2 = in.nextInt();
        int number3 = in.nextInt();
        int number4 = in.nextInt();
        int number5 = in.nextInt();
        int min = 0;
        int max = 0;

        if (number1 < number2 && number1 < number3 && number1 < number4 && number1 < number5) {
            min = number1;
        } else if (number2 < number1 && number2 < number3 && number2 < number4 && number2 < number5) {
            min = number2;
        } else if (number3 < number1 && number3 < number2 && number3 < number4 && number3 < number5) {
            min = number3;
        } else if (number4 < number1 && number4 < number3 && number4 < number2 && number4 < number5) {
            min = number4;
        } else if (number5 < number1 && number5 < number3 && number5 < number4 && number5 < number2) {
            min = number5;
        }
        System.out.println(" Min value : " + min);

        if (number1 > number2 && number1 > number3 && number1 > number4 && number1 > number5) {
            max = number1;
        } else if (number2 > number1 && number2 > number3 && number2 > number4 && number2 > number5) {
            max = number2;
        } else if (number3 > number1 && number3 > number2 && number3 > number4 && number3 > number5) {
            max = number3;
        } else if (number4 > number1 && number4 > number3 && number4 > number2 && number4 > number5) {
            max = number4;
        } else if (number5 > number1 && number5 > number3 && number5 > number4 && number5 > number2) {
            max = number5;
        }
        System.out.println(" Max value :" + max);
    }
}

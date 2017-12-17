package additionalTasksByWhile;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        long n;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.print(" Enter natural integer n : ");
            n = scan.nextInt();
            long result = 1;
            for (long i = 2; i <= n; i++)
                result *= i;
            System.out.println(result);
            if (n == 0 || n == 1)
                System.out.println(result);
            if (n < 0)
                System.out.println("You were entered negative factorial !");
        } while (n < 0);
        {
            System.out.println(" Nice calculation ! ");
        }
    }
}

package additionalTasksByWhile;

public class Example2 {
    public static void main(String[] args) {
        String number = "123";
        int i = 0;
        int result = 0;
        int current;
        while (i != number.length()) {
            current = Integer.parseInt(String.valueOf(number.charAt(i)));
            if (current % 2 == 0)
                result += current;
            i += 1;
        }
        System.out.println(result);
    }
}


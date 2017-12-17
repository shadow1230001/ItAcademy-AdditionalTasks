package additionalTasksByArray;

public class Example2 {
    public static void main(String[] args){
        int mass[] = new int[100];

        for (int j = 1; j < 100; j += 2) {
            mass[j] = j;
        }

        for (int i = 1; i < mass.length; i += 2) {
            System.out.println(mass[i]);
        }
    }
}

package additionalTasksByArray;

public class Example1 {
    public static void main(String[] args) {
        int[] mass = new int[20];
        int j=0;
        for (int i = 2; i <= 20; i++) {
            if (i % 2 == 0) {
                j++;
                mass[j-1] = i;
                System.out.println(mass[j-1] + " ");
            }
        }
    }
}

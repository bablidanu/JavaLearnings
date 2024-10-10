import java.util.Scanner;

public class ArithmeticProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the First term of A.P.(a) = ");
        int a = sc.nextInt();

        System.out.print("Enter the common difference of A.P.(d) = ");
        int d = sc.nextInt();

        System.out.print("Enter the number of terms of A.P.(n) = ");
        int n = sc.nextInt();
        sc.close();

        System.out.print("A.P. = ");
        for (int i = 0; i <= n; i++) {
            System.out.print(a + i * d + " ");
        }
System.out.println();
    }
}

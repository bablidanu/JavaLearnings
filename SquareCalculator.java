import java.util.Scanner;

public class SquareCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms : ");
        int numTerms = sc.nextInt();

        for (int i = 1; i <= numTerms; i++) {
            int square = i * i;
            System.out.println("Square of "+ i + " is " + square);
        }

        sc.close();
    }
}

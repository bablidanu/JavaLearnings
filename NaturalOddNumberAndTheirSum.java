import java.util.Scanner;

public class NaturalOddNumberAndTheirSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms : ");
        int num = sc.nextInt();

        int sum = 0;
        System.out.println("Odd numbers are : ");
        for (int i = 1; i <= num; i++) {
            int oddNumber = 2 * i - 1;
            System.out.print(oddNumber + " ");
            sum += oddNumber;
        }
        System.out.println("\n The sum of odd natural numbers upto " + num + " terms " + sum);

        sc.close();
    }
}

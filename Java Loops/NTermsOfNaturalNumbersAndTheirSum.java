import java.util.Scanner;

public class NTermsOfNaturalNumbersAndTheirSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms : ");
        int n = sc.nextInt();
        sc.close();

        int sum = 0;
        System.out.println("The first "+ n +" natural numbers are : ");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println("\n Sum of Natural Number upto " + n + " terms : " + sum);
    }
    }


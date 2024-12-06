import java.util.Scanner;

public class FindGCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1 = sc.nextInt();

        System.out.print("Enter the first number : ");
        int num2 = sc.nextInt();
        sc.close();

        while (num1 != num2) {
            if (num1 > num2) {
                num1 = num1 - num2;
            }
            if (num2 > num1) {
                num2 = num2 - num1;
            }
        }
        System.out.println("GCD : "+ num1);
    }
}

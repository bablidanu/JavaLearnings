import java.util.Scanner;

public class CheckingEquality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.println("Enter the first number : ");
        num1 = sc.nextInt();
        System.out.println("Enter the second number : ");
        num2 = sc.nextInt();
        if (num1 == num2) {
            System.out.println("Num1 and Num2 are equal");
        } else {
            System.out.println("Num1 and Num2 are not equal");
        }
         sc.close();
    }
}

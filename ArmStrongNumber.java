import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the 3-digit number : ");
        int num = sc.nextInt();

        int sum = 0;
        int temp = num;
         
        while (temp != 0) {
            int digit = temp % 10;
            sum += digit * digit * digit;  // checking for 3-digit armstrong numbers only (370)(371)(153)
            temp /= 10;
        }
        if (sum == num) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
        sc.close();
    }
}

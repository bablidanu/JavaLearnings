import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        sc.close();

        int temp = num;
        int reversenum = 0;

        while (temp != 0) {
            int digit = temp % 10;
            reversenum = reversenum * 10 + digit;
            temp /= 10;
        }
        if (reversenum == num) {
            System.out.println(num + " is a palindrome number");
        } else
        System.out.println(num + " is not a palindrome number");
    }
}

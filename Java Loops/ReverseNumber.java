import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        sc.close();

        int reversenum = 0;
        while (num != 0) { //123
            int digit = num % 10; //3,2,1
            reversenum = reversenum * 10 + digit; //321
            num /= 10; // Remove the last number each time
        }
        System.out.println("Reverse number is : "+reversenum);
    }
}

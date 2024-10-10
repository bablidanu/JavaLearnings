import java.util.Scanner;

public class OddDigitCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = sc.nextInt();

         int oddCount = 0;

        while (num != 0) {
            int digit = num % 10;
            if (digit % 2 != 0) {
                oddCount++;
            }
            num /= 10;
        }
        System.out.println("Number of odd digits is : "+ oddCount);
        sc.close();
    }
}

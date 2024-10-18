import java.util.Scanner;

public class EvenDigitCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        int evenNum = 0;
        
        while (num != 0) {
            int digit = num % 10;
            if (digit % 2 == 0) {
                evenNum++;
            }
            num /= 10;
        }
        System.out.println("Number of even digits : "+ evenNum);
        sc.close();
    }
}

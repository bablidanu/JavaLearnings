import java.util.Scanner;

public class EvenDigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = sc.nextInt();          // taking the number from the user
        
        sc.close();

        int evenSum = 0; 

        while (num != 0) { 
            int digit = num % 10; //Extract the last digit of the given number.
            if (digit % 2 == 0) //if that(remainder)is purely divible by 2 than it will store it in evenSum.
                evenSum += digit; 
                num /= 10;
        }
        System.out.print("sum of all the even numbers is : " + evenSum);
    }
    }

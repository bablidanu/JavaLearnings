import java.util.Scanner;

public class CheckingWhetherTheNumIsPositiveOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("enter the num : ");
        num = sc.nextInt();
        if (num < 0) {
            System.out.println("Number is negative");
        }
        else if (num == 0) {
            System.out.println("Number is equal to zero");
        } else {
            System.out.println("Number is positive");
         }
        sc.close();

    }
}

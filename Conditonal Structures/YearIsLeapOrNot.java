import java.util.Scanner;

public class YearIsLeapOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.print("Enter the Year : ");
        year = sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("The given year is a leap year");
        } else {
            System.out.println("The given year is not a leap year");
        }
        sc.close();
    }
}

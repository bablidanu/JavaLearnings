import java.util.Scanner;

public class TriangleValidity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        System.out.print("Enter the 1st angle : ");
        int angle1 = sc.nextInt();

        System.out.print("Enter the 2nd angle : ");
        int angle2 = sc.nextInt();

        System.out.print("Enter the 3rd angle : ");
        int angle3 = sc.nextInt();
        int sumOfAngles = (int) (angle1 + angle2 + angle3);
        
        if (sumOfAngles == 180) {
            System.out.println("The Triangle is Valid");
        } else {
            System.out.println("Triangle is invalid");
        }

        sc.close();
    }
}

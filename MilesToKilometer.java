import java.util.Scanner;

public class MilesToKilometer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float miles, kilometer;
        System.out.println("Enter the value in miles : ");
        miles = sc.nextFloat();
        kilometer =(float) (1.609*miles);
        System.out.println("Value in kilometers is :"+kilometer);
        sc.close();
    }
}

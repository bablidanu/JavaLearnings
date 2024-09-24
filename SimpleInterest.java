import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float principal, rate, time,simpleinterest;
        System.out.println("Enter the value of principal :");
        principal = sc.nextFloat();
        System.out.println("Enter the rate :");
        rate = sc.nextFloat();
        System.out.println("Enter the Time in years : ");
        time = sc.nextFloat();
        simpleinterest = (float) ((principal * rate * time)/100);
        System.out.println("Simple interest is :"+simpleinterest);
        sc.close();
    }
}

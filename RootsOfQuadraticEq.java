import java.util.Scanner;

public class RootsOfQuadraticEq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of b : ");
        float b = sc.nextFloat();
        System.out.println("Enter the value of a : ");
        float a = sc.nextFloat();
        System.out.println("Enter the value of c : ");
        float c = sc.nextFloat();
        int discriminant = (int)((b*b) - 4*a*c);
        System.out.println("Your quadratic eq is : " + a + "x^2 +" + b + "x +" + c);
        if (discriminant >= 0) {
            System.out.println("Quadratic Eq has real roots");
        } else {
            System.out.println("Eq has imaginary roots");
        }
        sc.close();
    }
}

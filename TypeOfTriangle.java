import java.util.Scanner;

public class TypeOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First side of Triangle : ");
        float side1 = sc.nextFloat();

        System.out.println("Enter the Second side of Triangle : ");
        float side2 = sc.nextFloat();
        
        System.out.println("Enter the Third side of Triangle : ");
        float side3 = sc.nextFloat();

        if (side1 == side2 && side2 == side3) {
            System.out.println("This is an equilateral Triangle");
        } else if (side1 == side2 || side2 == side3 || side3 == side1) {
            System.out.println("This is Isosceles Triangle");
        } else {
            System.out.println("This is Scalene Triangle");
        }

        sc.close();
    }
}

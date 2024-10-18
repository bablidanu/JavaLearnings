import java.util.Scanner;
public class AreaOfTriangle {
    public static void main(String[] args) {
        float breadth, height, area;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the height of the triangle : ");
        height = sc.nextFloat();
         System.out.println("enter the breadth of the triangle : ");
        breadth = sc.nextFloat();
        area = (float) (1.0 / 2.0 * breadth * height);
        System.out.println("Area of the triangle is " + area);
        sc.close();
    }
}

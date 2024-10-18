import java.util.Scanner;

public class SurfaceAreaOfCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pi = 3.14f, radius, height, surfacearea;
        System.out.println("Enter the radius : ");
        radius = sc.nextFloat();
        System.out.println("Enter the height : ");
        height = sc.nextFloat();
        surfacearea = (float) (2 * pi * radius * (radius + height));
          System.out.println("Surface area of Cylinder is : "+surfacearea);
        sc.close();
    }
}

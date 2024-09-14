import java.util.Scanner;

public class SurfaceAreaOfSphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pi = 3.14f, radius, surfacearea;
        System.out.println("Enter the radius :");
        radius = sc.nextFloat();
        surfacearea = (float) (4 * pi * radius * radius);
        System.out.println("Surface area of the sphere is : "+surfacearea);
        sc.close();
    }
}

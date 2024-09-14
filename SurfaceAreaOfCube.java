import java.util.Scanner;

public class SurfaceAreaOfCube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float radius, surfacearea;
        System.out.println("Enter the radius : ");
        radius = sc.nextFloat();
        surfacearea = (float)(6 * radius * radius);
       System.out.println("Surface area of cube is :"+surfacearea);
        sc.close();
    }
}

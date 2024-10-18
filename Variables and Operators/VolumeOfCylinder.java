import java.util.Scanner;

 public class VolumeOfCylinder {
    public static void main(String[] args) {
        float r, pi = 3.14f, height,volume;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of cylinder : ");
        r = sc.nextFloat();
        System.out.println("Enter the height of cylinder : ");
        height = sc.nextFloat();
        volume = pi * r * r * height;
        System.out.println("Volume of the Cylinder is : " + volume);
        sc.close();
    }
}

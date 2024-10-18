import java.util.Scanner;

public class VolumeOfCone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float radius, height, pi = 3.14f,volumeofcone;
        System.out.println("Enter the radius of the cone : ");
        radius = sc.nextFloat();
        System.out.println("Enter the height of the cone : ");
        height = sc.nextFloat();
        volumeofcone = (float) (1.0 / 3.0 * pi * radius * radius * height);
        System.out.println("Volume of the given cone is : " + volumeofcone);
        sc.close();
    }
}

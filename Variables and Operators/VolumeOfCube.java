import java.util.Scanner;
public class VolumeOfCube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float side,volume;
        System.out.println("Enter the side of cube : ");
        side = sc.nextFloat();
        volume = side * side * side;
        System.out.println("Volume og the cube is: "+volume);
        sc.close();
    }
}

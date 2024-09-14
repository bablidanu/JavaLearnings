import java.util.Scanner;

public class SphereVolume {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // volume of sphere : 4/3*pi*r^3
    float radius, pi = 3.14f, VolumeofSphere;
  System.out.println("enter the radius : ");
  radius = sc.nextFloat();
  VolumeofSphere=(float)(4.0/3.0*pi*radius*radius*radius);
  System.out.println("The volume of sphere is :"+VolumeofSphere);
   sc.close();
}
}

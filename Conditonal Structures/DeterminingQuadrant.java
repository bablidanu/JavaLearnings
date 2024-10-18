import java.util.Scanner;

public class DeterminingQuadrant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the x-coordinate : ");
        float x = sc.nextFloat();

        System.out.println("Enter the y-coordinate : ");
        float y = sc.nextFloat();

        if (x > 0 && y > 0) {
            System.out.println("The Coordinate point(" + x + ","+ y + ")lies on the 1st quadrant");
        } else if(x < 0 && y > 0){
              System.out.println("The Coordinate point(" + x + ","+ y + ")lies on the 2nd quadrant");
        } else if (x < 0 && y < 0) {
              System.out.println("The Coordinate point(" + x + ","+ y + ")lies on the 3rd quadrant");
        } else if (x > 0 && y < 0) {
              System.out.println("The Coordinate point(" + x + ","+ y + ")lies on the 4th quadrant");
        }  else if (x == 0 && y > 0) {
            System.out.println("Coordinate lies on the positive y-axis");
        } else if (x == 0 && y < 0) {
            System.out.println("Coordinate lies on the negative y-axis");
        } else if (x > 0 && y == 0) {
            System.out.println("Coordinate lies on the positive x-axis");
        } else if (x < 0 && y == 0) {
            System.out.println("Coordinate lies on the negative x-axis");
        } else {
            System.out.println("Coordinate lies at origin");
        }
        sc.close();
    }
}
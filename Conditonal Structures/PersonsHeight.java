import java.util.Scanner;

public class PersonsHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the height of the person in cm : ");
        int height = sc.nextInt();
        
        if ( height > 1 && height < 150) {
            System.out.println("The person is Dwarf");
        } else if (height > 150 && height < 180) {
            System.out.println("Person is of medium height");
        } else if (height > 180) {
            System.out.println("Person is tall as tree");
        } else {
            System.out.println("Pls enter the valid input");
        }

        sc.close();
    }
}

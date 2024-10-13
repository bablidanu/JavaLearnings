import java.util.Scanner;

public class ElectricityCharge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Id : ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Your name : ");
        String name = sc.nextLine();

        System.out.print("Enter unit consumed : ");
        long unit = sc.nextLong();
         sc.close();

        double amount = 0, surcharge;

        if (unit > 0 && unit < 200) {
            amount = unit * 3.20;
        } else if (unit >= 200 && unit < 400) {
            amount = unit * 5.50;
        } else if (unit >= 400 && unit < 600) {
            amount = unit * 8.80;
        } else if (unit >= 600) {
            amount = unit * 9.0;
        } else {
            System.out.println("Invalid unit!");
            System.exit(0);
        }

        System.out.println("The expected amount : " + amount);
        if (amount > 1000) {
            surcharge = amount * 0.15;
            System.out.println("Surcharge added : " + surcharge + " @15%");
            amount += surcharge;
        }
        if (amount < 200) {
            System.out.println("Minimun bill should be paid rupees 200/-");
            amount = 200;
        }
        
        System.out.println("The net amount to be paid is : "+amount);
    }
}

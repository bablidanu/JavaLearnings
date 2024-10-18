import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Temperature in Celcius : ");
        float temp = sc.nextFloat();

        if (temp < 0) {
            System.out.println("Freezing weather");
        } else if(temp >= 0 && temp <= 10){
            System.out.println("Very Cold weather");
        } else if (temp > 10 && temp <= 20) {
            System.out.println("Cold weather");
        } else if (temp > 20 && temp <= 30) {
            System.out.println("Normal weather");
        } else if (temp > 30 && temp <= 40) {
            System.out.println("It is Hot");
        } else {
            System.out.println("It is very hot");
        }

        sc.close();
    }
}

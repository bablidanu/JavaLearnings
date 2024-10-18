import java.util.Scanner;

public class FahrenheitToCelcius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float temp, celciusValue;
        System.out.println("Enter the temperature you want to convert into celcius :");
        temp = sc.nextFloat();
        celciusValue = (float) ((temp - 32) * 5.0 / 9.0);
        System.out.println("The value off temperature in celcius is equal to : " + celciusValue);
        sc.close();
    }
}

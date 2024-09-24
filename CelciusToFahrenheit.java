import java.util.Scanner;

public class CelciusToFahrenheit {
    public static void main(String[] args) {
        float temp, fahrenheitValue;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of temperature : ");
        temp = sc.nextFloat();
        fahrenheitValue = (float) ( temp * 9.0 / 5.0  + 32);
        System.out.println("Value of temperature in fahrenheit is :"+fahrenheitValue);
        sc.close();
    }
}

import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        System.out.println("Input the 10 numbers:");
        for (int i = 1; i <= 10; i++) {
            System.out.print("Number-" + i + " : ");
            int num = scanner.nextInt();
            sum += num;
        }
        scanner.close();

        double average = (double) sum / 10;

        System.out.println("The sum of 10 no is: " + sum);
        System.out.println("The Average is: " + average);
    }
}

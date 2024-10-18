import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms of Fibonacci series : ");
        int terms = sc.nextInt();

        int[] fibSeries = new int[terms];
        fibSeries[0] = 0;
        fibSeries[1] = 1;

        for (int i = 2; i < terms; i++) {
            fibSeries[i] = fibSeries[i-1] + fibSeries[i-2];
        }

        System.out.print("Fibonacci series up to " + terms + " numbers: ");
        for (int i = 0; i < terms; i++) {
            System.out.print(fibSeries[i] + " ");
        }
        sc.close();
    }
    }


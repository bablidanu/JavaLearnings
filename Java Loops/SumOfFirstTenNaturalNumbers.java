public class SumOfFirstTenNaturalNumbers {
    public static void main(String[] args) {
        int sum = 0;
        System.out.print("The first 10 natural numbers are: ");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println("\nThe Sum is: " + sum);
    }
    }


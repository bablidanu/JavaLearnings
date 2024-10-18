import java.util.Scanner;

public class ProfitOrLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        System.out.println("Enter the cost price : ");
        int costPrice = sc.nextInt();

        System.out.println("Enter the selling price : ");
        int sellingPrice = sc.nextInt();

        int loss = (int) (costPrice - sellingPrice);

        int profit = (int) (sellingPrice - costPrice);

        if (costPrice > sellingPrice) {
        System.out.println("you have loss of "+ loss);
        } else if (sellingPrice > costPrice) {
        System.out.println("You have profit of "+profit);
         } else {
       System.out.println("No profit and loss is gained");
         }
        sc.close();
    }
}

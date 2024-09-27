public class MultiplicationTable {
    public static void main(String[] args) {
        int num = 8;
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print(j + " x " + i + " = " + j * i);
                if (j < num) {
                    System.out.print(" , ");
                }
            }
            System.out.println();
        }
    }
}

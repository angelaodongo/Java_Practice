import java.util.Scanner;

public class Shopping {
    public static void main(String[] args)
    {
        double price = 0;
        int quantity = 0;
        double total = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the item price: ");
        price = scanner.nextDouble();

        System.out.printf("Enter the quantity: ");
        quantity = scanner.nextInt();

        total = price * quantity;

        System.out.printf("Total: %.2f", total);

        scanner.close();
    }
}

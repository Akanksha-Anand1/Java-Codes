import java.util.Scanner;

public class PurchaseDiscount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take purchase value
        System.out.print("Enter total bill: ");
        double total = input.nextDouble();
        double rebate, payable;

        // Apply discount
        if (total > 100) {
            rebate = total * 0.1;  
        } else {
            rebate = total * 0.05;  
        }

        payable = total - rebate;

        // Display result
        System.out.println("Total Purchase: " + total);
        System.out.println("Discount Given: " + rebate);
        System.out.println("Amount Payable: " + payable);

        input.close();
    }
}


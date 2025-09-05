import java.util.Scanner;

public class ATMSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double accountBalance = 1000.0;
        int option;

        do {
            System.out.println("\n--- ATM OPTIONS ---");
            System.out.println("1. View Balance");
            System.out.println("2. Add Money");
            System.out.println("3. Take Money");
            System.out.println("4. Quit");
            System.out.print("Choose an option: ");

            option = input.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Available Balance: ₹" + accountBalance);
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ₹");
                    double add = input.nextDouble();
                    if (add > 0) {
                        accountBalance += add;
                        System.out.println("₹" + add + " added successfully!");
                    } else {
                        System.out.println("Deposit amount must be greater than 0!");
                    }
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: ₹");
                    double take = input.nextDouble();
                    if (take > 0 && take <= accountBalance) {
                        accountBalance -= take;
                        System.out.println("₹" + take + " withdrawn successfully!");
                    } else if (take > accountBalance) {
                        System.out.println("Not enough balance!");
                    } else {
                        System.out.println("Invalid withdrawal amount!");
                    }
                    break;

                case 4:
                    System.out.println("Exiting... Have a nice day!");
                    break;

                default:
                    System.out.println("Wrong option! Try again.");
            }

        } while (option != 4);

        input.close();
    }
}

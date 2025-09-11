package Assignment;

public class Account {
    // Attributes
    private int accountNumber;
    private String accountHolderName;
    private double balance;
    private String email;
    private String phoneNumber;
    
    // Constructor
    public Account(int accountNumber, String accountHolderName, double initialDeposit, 
                   String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialDeposit;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    
    // Method to deposit money
    public boolean deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Please enter a positive amount!");
            return false;
        }
        balance += amount;
        System.out.println("Added $" + amount + " to your account");
        System.out.println("Your balance is now: $" + balance);
        return true;
    }
    
    // Method to withdraw money
    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Please enter a positive amount!");
            return false;
        }
        if (amount > balance) {
            System.out.println("Not enough money! You have: $" + balance);
            return false;
        }
        balance -= amount;
        System.out.println("Took out $" + amount + " from your account");
        System.out.println("You have left: $" + balance);
        return true;
    }
    
    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("\nYour Account Info");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Name: " + accountHolderName);
        System.out.println("Balance: $" + balance);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phoneNumber);
    }
    
    // Method to update contact details
    public void updateContactDetails(String newEmail, String newPhoneNumber) {
        // String validation for email (basic check)
        if (newEmail != null) {
            this.email = newEmail;
            System.out.println("Email updated!");
        } else {
            System.out.println("Email looks wrong!");
        }
        
        // String validation for phone number (basic check)
        if (newPhoneNumber != null) {
            this.phoneNumber = newPhoneNumber;
            System.out.println("Phone number updated!");
        } else {
            System.out.println("Phone number looks wrong!");
        }
    }
    
    // Getter methods
    public int getAccountNumber() {
        return accountNumber;
    }
    
    public String getAccountHolderName() {
        return accountHolderName;
    }
    
    public double getBalance() {
        return balance;
    }
}

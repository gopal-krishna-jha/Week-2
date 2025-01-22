//Create a class BankAccount to represent and manage account holder details
class BankAccount {
    // Define static and instance variables for bank and account holder details
    private static String bankName = "Bank Of India"; // Bank name common to all accounts
    private String accountHolderName; // Name of the account holder
    private final int accountNumber; // Unique account number
    private static int totalAccountHolder = 0; // Counter for total accounts created

    // Constructor to initialize account holder details
    public BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccountHolder++; // Increment total account count
    }

    // Static method to return the total number of accounts created
    public static int getTotalAccounts() {
        return totalAccountHolder;
    }

    // Instance method to display the details of an account holder
    public void displayDetails() {
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Number: " + accountNumber);
    }
}

// Create a class UseBankAccount to demonstrate the BankAccount class
public class UseBankAccount {
    public static void main(String[] args) {
        // Create objects of BankAccount class with account holder details
        BankAccount account1 = new BankAccount("Ravi", 123456);
        BankAccount account2 = new BankAccount("Shayam", 789456);

        // Check if account1 is an instance of BankAccount before displaying details
        if (account1 instanceof BankAccount) {
            // Display details of the first account holder
            account1.displayDetails();
            System.out.println(); // New line for better readability

            // Display details of the second account holder
            account2.displayDetails();
        }

        // Print the total number of accounts created
        int totalAccounts = BankAccount.getTotalAccounts();
        System.out.println("Total Number of Accounts: " + totalAccounts);
    }
}

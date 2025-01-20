import java.util.*;

//Create a class CustomerAccount for bank details
public class CustomerAccount {
    // Variables for storing customer details
    String customerName, accountId;
    double accountBalance;

    // Constructor to initialize a new customer account
    public CustomerAccount(String customerName, String accountId, double initialBalance) {
        this.customerName = customerName;
        this.accountId = accountId;
        this.accountBalance = initialBalance;
    }

    // Method to add funds to the account
    public void addFunds(double depositAmount) {
        if (depositAmount > 0) {
            accountBalance += depositAmount;
            System.out.println("Deposited " + depositAmount + ". New balance: " + accountBalance + ".");
        } else {
            System.out.println("Invalid deposit amount. Please enter a positive value.");
        }
    }

    // Method to deduct funds from the account
    public void deductFunds(double withdrawalAmount) {
        if (withdrawalAmount > 0 && withdrawalAmount <= accountBalance) {
            accountBalance -= withdrawalAmount;
            System.out.println("Withdrew " + withdrawalAmount + ". New balance: " + accountBalance + ".");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Method to show the account balance
    public void showBalance() {
        System.out.println("Current balance: " + accountBalance + ".");
    }
}

// Create a class AccountOperations to use the functionality of CustomerAccount
 class AccountOperations {

    public static void main(String[] args) {
        // Create an object of Scanner class
        Scanner scanner = new Scanner(System.in);

        // Collect account holder's details from the user
        System.out.print("Enter Customer Name: ");
        String customerName = scanner.nextLine();

        System.out.print("Enter Account ID: ");
        String accountId = scanner.next();

        System.out.print("Enter Initial Balance: ");
        double initialBalance = scanner.nextDouble();

        System.out.print("Enter 1 to Deposit, 2 to Withdraw, 3 to Check Balance: ");
        int userChoice = scanner.nextInt();

        // Create an object of CustomerAccount class
        CustomerAccount userAccount = new CustomerAccount(customerName, accountId, initialBalance);

        // Variable to store transaction amounts
        double transactionAmount;

        // Perform operations based on user choice
        if (userChoice == 1) {
            System.out.print("Enter Deposit Amount: ");
            transactionAmount = scanner.nextDouble();
            userAccount.addFunds(transactionAmount);
        } else if (userChoice == 2) {
            System.out.print("Enter Withdrawal Amount: ");
            transactionAmount = scanner.nextDouble();
            userAccount.deductFunds(transactionAmount);
        } else if (userChoice == 3) {
            userAccount.showBalance();
        } else {
            System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}

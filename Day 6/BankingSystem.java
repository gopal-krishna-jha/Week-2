// Interface for loanable accounts
interface Loanable {
    // Method to apply for a loan
    void applyForLoan(double amount);

    // Method to calculate loan eligibility based on account criteria
    boolean calculateLoanEligibility();
}

// Abstract class for bank accounts
abstract class BankAccount {
    // Private fields to store account information
    private String accountNumber; // Unique identifier for the account
    private String holderName; // Name of the account holder
    private double balance; // Current balance of the account

    // Constructor to initialize account details
    public BankAccount(String accountNumber, String holderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = initialBalance; // Set initial balance
    }

    // Getter method for account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // Getter method for account holder's name
    public String getHolderName() {
        return holderName;
    }

    // Getter method for the current balance
    public double getBalance() {
        return balance;
    }

    // Concrete method to deposit an amount into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount; // Add amount to balance
            System.out.println("Deposited: " + amount + ". New balance: " + balance);
        } else {
            // Inform if the deposit amount is invalid
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Concrete method to withdraw an amount from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount; // Subtract amount from balance
            System.out.println("Withdrawn: " + amount + ". New balance: " + balance);
        } else {
            // Inform if the withdrawal amount is invalid or insufficient
            System.out.println("Insufficient balance or invalid withdrawal amount.");
        }
    }

    // Abstract method to calculate interest based on account type
    public abstract double calculateInterest();
}

// Subclass for SavingsAccount
class SavingsAccount extends BankAccount implements Loanable {
    private double interestRate; // Interest rate for the savings account

    // Constructor to initialize savings account details
    public SavingsAccount(String accountNumber, String holderName, double initialBalance, double interestRate) {
        super(accountNumber, holderName, initialBalance); // Call parent constructor
        this.interestRate = interestRate; // Set interest rate
    }

    // Method to calculate interest based on balance and interest rate
    @Override
    public double calculateInterest() {
        return getBalance() * (interestRate / 100); // Calculate interest
    }

    // Method to apply for a loan specific to the savings account
    @Override
    public void applyForLoan(double amount) {
        System.out.println("Loan application for " + amount + " submitted for Savings Account: " + getAccountNumber());
    }

    // Method to check loan eligibility based on account balance
    @Override
    public boolean calculateLoanEligibility() {
        // Example eligibility criteria: Must have a minimum balance of 1000
        return getBalance() >= 1000;
    }
}

// Subclass for CurrentAccount
class CurrentAccount extends BankAccount implements Loanable {
    private double overdraftLimit; // Maximum overdraft allowed

    // Constructor to initialize current account details
    public CurrentAccount(String accountNumber, String holderName, double initialBalance, double overdraftLimit) {
        super(accountNumber, holderName, initialBalance); // Call parent constructor
        this.overdraftLimit = overdraftLimit; // Set overdraft limit
    }

    // Method to calculate interest; current accounts typically do not earn interest
    @Override
    public double calculateInterest() {
        return 0; // No interest earned on current accounts
    }

    // Method to apply for a loan specific to the current account
    @Override
    public void applyForLoan(double amount) {
        System.out.println("Loan application for " + amount + " submitted for Current Account: " + getAccountNumber());
    }

    // Method to check loan eligibility based on balance and overdraft limit
    @Override
    public boolean calculateLoanEligibility() {
        // Example eligibility criteria: Total funds available should be at least 500
        return getBalance() + overdraftLimit >= 500;
    }
}

// Main class to demonstrate the Banking System functionality
public class BankingSystem {
    public static void main(String[] args) {
        // Creating instances of different account types
        BankAccount savingsAccount = new SavingsAccount("SA123", "John Doe", 1500, 5); // Savings account with 5%
                                                                                       // interest
        BankAccount currentAccount = new CurrentAccount("CA456", "Jane Smith", 200, 500); // Current account with 500
                                                                                          // overdraft limit

        // Demonstrating polymorphism by processing different account types and
        // calculating interest dynamically
        BankAccount[] accounts = { savingsAccount, currentAccount }; // Array of BankAccount references

        // Iterate through each account and display account holder's information and
        // interest
        for (BankAccount account : accounts) {
            System.out.println("Account Holder: " + account.getHolderName());
            System.out.println("Interest: " + account.calculateInterest()); // Calculate and display interest for each
                                                                            // account
            System.out.println("Balance: " + account.getBalance()); // Display current balance
            System.out.println(); // Add an empty line for better readability
        }

        // Demonstrating deposit and withdrawal operations
        savingsAccount.deposit(500); // Deposit 500 into savings account
        savingsAccount.withdraw(200); // Withdraw 200 from savings account

        currentAccount.deposit(300); // Deposit 300 into current account
        currentAccount.withdraw(600); // Withdraw 600 from current account (should be allowed due to overdraft limit)

        // Demonstrating loan application for both accounts
        ((Loanable) savingsAccount).applyForLoan(1000); // Apply for loan on savings account
        ((Loanable) currentAccount).applyForLoan(2000); // Apply for loan on current account

        // Check and display loan eligibility for both accounts
        System.out
                .println("Savings Account Loan Eligibility: " + ((Loanable) savingsAccount).calculateLoanEligibility());
        System.out
                .println("Current Account Loan Eligibility: " + ((Loanable) currentAccount).calculateLoanEligibility());
    }
}

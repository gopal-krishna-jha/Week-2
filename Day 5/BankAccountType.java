// Define a BankAccount class to represent general bank account details
class BankAccount {
    // Instance variables to store account number and balance
    public String accountNumber;
    protected double balance;

    // Parameterized constructor to initialize account number and balance
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to display account details including account number and balance
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println();
    }
}

// Define a SavingsAccount class that extends BankAccount and adds interest rate
class SavingsAccount extends BankAccount {

    // Instance variable to store interest rate
    public double interestRate;

    // Parameterized constructor to initialize account number, balance, and interest
    // rate
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance); // Call the constructor of the base class
        this.interestRate = interestRate;
    }

    // Method to display account type and interest rate
    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
        System.out.println("Rate of interest: " + interestRate + "%");
    }

}

// Define a CheckingAccount class that extends BankAccount and adds withdrawal
// limit
class CheckingAccount extends BankAccount {

    // Instance variable to store the withdrawal limit
    public double withdrawalLimit;

    // Parameterized constructor to initialize account number, balance, and
    // withdrawal limit
    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance); // Call the constructor of the base class
        this.withdrawalLimit = withdrawalLimit;
    }

    // Method to display account type and withdrawal limit
    public void displayAccountType() {
        System.out.println("Account Type: Checking Account");
        System.out.println("Withdrawal limit: " + withdrawalLimit);
    }

}

// Define a FixedDepositAccount class that extends BankAccount and adds fixed
// deposit details
class FixedDepositAccount extends BankAccount {
    // Instance variables to store deposit amount and duration
    double amount;
    int duration;

    // Parameterized constructor to initialize account number, balance, amount, and
    // duration
    public FixedDepositAccount(String accountNumber, double balance, double amount, int duration) {
        super(accountNumber, balance); // Call the constructor of the base class
        this.amount = amount;
        this.duration = duration;
    }

    // Method to display account type, fixed deposit amount, and duration
    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        System.out.println("Fixed Deposit: " + amount);
        System.out.println("Duration: " + duration + " months");
    }

}

// Main class to test different types of bank accounts
public class BankAccountType {
    public static void main(String[] args) {
        // Create an object of SavingsAccount class with account number, balance, and
        // interest rate
        SavingsAccount account1 = new SavingsAccount("0441653265413", 15000, 2);

        // Display the account type and details for SavingsAccount
        account1.displayAccountType();
        account1.displayAccountDetails();

        // Create an object of CheckingAccount class with account number, balance, and
        // withdrawal limit
        CheckingAccount account2 = new CheckingAccount("5036232032162", 30000, 10000);

        // Display the account type and details for CheckingAccount
        account2.displayAccountType();
        account2.displayAccountDetails();

        // Create an object of FixedDepositAccount class with account number, balance,
        // amount, and duration
        FixedDepositAccount account3 = new FixedDepositAccount("4161316503151", 50000, 30000, 12);

        // Display the account type and details for FixedDepositAccount
        account3.displayAccountType();
        account3.displayAccountDetails();
    }
}

// Create a class BankAccount to indicate the bank details
class BankAccount {
    // Declare instance variables
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    // Parameterized Constructor to initialize the bank account details
    public BankAccount(int accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    // Method to get the balance
    public double getBalance() {
        return balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Method to get the account holder's name
    protected String getAccountHolder() {
        return accountHolder;
    }
}

// Create a Subclass SavingsAccount
class SavingsAccount extends BankAccount {

    // Parameterized Constructor to initialize the savings account details
    public SavingsAccount(int accountNumber, String accountHolder, double initialBalance) {
        super(accountNumber, accountHolder, initialBalance);
    }

    // Method to display the savings account details
    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + getAccountHolder());
        System.out.println("Balance: $" + getBalance());
    }

    public static void main(String[] args) {
        // Create an object of the SavingsAccount class
        SavingsAccount savings = new SavingsAccount(12345678, "Ravi Kumar", 1500.0);

        // Call a method to display the savings account details
        savings.displayDetails();

        // Call a method to deposit money
        savings.deposit(750.0);

        // Call a method to withdraw money
        savings.withdraw(300.0);

        // Call a method to display the updated details
        System.out.println("\nUpdated Details:");
        savings.displayDetails();
    }
}

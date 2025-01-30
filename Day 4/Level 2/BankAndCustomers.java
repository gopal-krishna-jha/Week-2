import java.util.*;

// Account class representing a bank account
class Account {
    private String accountNumber;
    private double balance;

    // Constructor to initialize account attributes
    public Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Method to view account balance
    public double getBalance() {
        return balance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        balance += amount;
    }

    // Method to withdraw money from the account
    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    // Getter for account number
    public String getAccountNumber() {
        return accountNumber;
    }
}

// Customer class representing a bank customer
class Customer {
    private String name;
    private ArrayList<Account> accounts;

    // Constructor to initialize customer attributes
    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    // Method to view balance of all accounts
    public void viewBalances() {
        System.out.println(name + "'s Accounts:");
        for (Account account : accounts) {
            System.out.println("Account Number: " + account.getAccountNumber() + " | Balance: " + account.getBalance());
        }
    }

    // Method to add an account to the customer
    public void addAccount(Account account) {
        accounts.add(account);
    }
}

// Bank class representing a bank that holds customers
class Bank {
    private String bankName;
    private ArrayList<Customer> customers;

    // Constructor to initialize the bank
    public Bank(String bankName) {
        this.bankName = bankName;
        this.customers = new ArrayList<>();
    }

    // Method to add a customer to the bank
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    // Method for the bank to open an account for a customer
    public Account openAccount(Customer customer, double initialBalance) {
        String accountNumber = "ACC" + (customers.size() + 1); // Generate a simple account number
        Account account = new Account(accountNumber, initialBalance);
        customer.addAccount(account);
        return account;
    }

    // Method to display all customers of the bank
    public void displayCustomers() {
        System.out.println("Customers of " + bankName + ":");
        for (Customer customer : customers) {
            System.out.println("Customer Name: " + customer.name);
        }
    }
}

public class BankAndCustomers {
    public static void main(String[] args) {
        // Create a bank object
        Bank bank = new Bank("Global Bank");

        // Create customer objects
        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");

        // Add customers to the bank
        bank.addCustomer(customer1);
        bank.addCustomer(customer2);

        // Open accounts for the customers
        bank.openAccount(customer1, 500.0);
        bank.openAccount(customer2, 1000.0);

        // View balances for customers
        customer1.viewBalances();
        customer2.viewBalances();

        // Deposit money into Alice's account
        Account aliceAccount = customer1.accounts.get(0);
        aliceAccount.deposit(200.0);

        // Withdraw money from Bob's account
        Account bobAccount = customer2.accounts.get(0);
        bobAccount.withdraw(300.0);

        // View updated balances
        System.out.println("\nUpdated Balances:");
        customer1.viewBalances();
        customer2.viewBalances();
    }
}

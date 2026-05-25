// Problem Statement: CAT II 2026
// Design a Java program to model a Bank Account system using the principles
// of encapsulation, abstraction, and interfaces.Follow these requirements:

// 3.Interface (6 Marks)
// Create an interface Transaction with methods:
// deposit(double amount)
// withdraw(double amount)(Reject if insufficient balance).
interface Transaction {
    void deposit(double amount);
    void withdraw(double amount);
}

// 2.Abstraction (6 Marks)
// Create an abstract class Account with: Common fields (e.g.,accountNumber,accountHolderName).
abstract class Account {
    protected String accountNumber;
    protected String accountHolderName;

    // Parameterized Constructor to initialize account number and holder name
    public Account(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
    }

    // Abstract method displayAccountInfo().
    public abstract void displayAccountInfo();
}

// 1. Encapsulation (6 Marks)
// Make BankAccount inherit from Account.
class BankkAccount extends Account implements Transaction{
    //Create a BankAccount class with private fields: balance (double)
    private double balance;

    // Constructor to initialise fields accountNumber and accountHolderName
    public BankkAccount(String accountNumber, String accountHolderName, double initialBalance) {
       super(accountNumber, accountHolderName);
       this.accountNumber = accountNumber;
       this.accountHolderName = accountHolderName;
       
       // Validate the Initial Balance cannot be negative
       if (initialBalance >= 0) {
        this.balance = initialBalance;
       } else {
        System.out.println("Error: Initial Balance cannot be negative");
        this.balance = 0.0;
       }
    }

    // Provide public getter/setter methods for all fields,with accountNumber cannot be modified after creation.
    // Account Number: Getter Only - Read only
    public String getAccountNumber() {
        return this.accountNumber;
    }

    // AccountHolderName: Getter and Setter
    public String getAccountHolderName() {
        return this.accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    // Balance: Getter and Setter with Validation
    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Error: Balance cannot be negative.");
        }
    }

    // Interface Method Implementations
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Successfully deposited: sh" + amount);
        } else {
            System.out.println("Error: Deposit amount must be positive.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Withdrawal amount must be positive.");
        } else if (amount > this.balance) {
            // Reject if insufficient balance
            System.out.println("Transaction Failed: Insufficient balance to withdraw sh" + amount);
        } else {
            this.balance -= amount;
            System.out.println("Successfully withdrew: sh" + amount);
        }
    }

    // Abstract Method Implementations
    @Override
    public void displayAccountInfo() {
        System.out.println("\n=== Account Information ===");
        System.out.println("Account Number : " + getAccountNumber());
        System.out.println("Account Holder : " + getAccountHolderName());
        System.out.println("Current Balance: sh" + getBalance());
        System.out.println("===========================\n");
    }

}

// 4.In a Main class,create a BankAccount object and demonstrate:
public class Main {
    public static void main(String[] args) {
        // Create a BankAccount Object with initial balance of 0
        BankkAccount myAccount = new BankkAccount("BAC-12345", "Abby Sarah", 0.0);

        // Initial Account Info Display
        myAccount.displayAccountInfo();

        // Depositing sh1000.
        myAccount.deposit(1000.0);
        System.out.println("Current Balance: sh" + myAccount.getBalance());
        System.out.println("------------------------------------------------");

        // Withdrawing sh500
        myAccount.withdraw(500.0);
        System.out.println("Current Balance: sh" + myAccount.getBalance());
        System.out.println("------------------------------------------------");

        // Trying to withdraw sh2000(should fail).
        myAccount.withdraw(2000.0);
        System.out.println("Current Balance: sh" + myAccount.getBalance());
        System.out.println("------------------------------------------------");

        // Displaying Final account info
        myAccount.displayAccountInfo();
    }
}



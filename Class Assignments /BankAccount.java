public class BankAccount {

    // Instance Variables
    private int balance;

    // Create a new account with no money it
    public BankAccount() {
        balance = 1000;
    }

    // Deposit Kshs. 1000 to the account
    public void myDeposit() {
        balance += 1000;
    }

    // Withdraw Kshs. 1000 from the account (No Overdrawn Restrictions)
    public void myWithdrawal() {
        balance -= 1000;
    }

    // Returns the current balance
    public int getBalance() {
        return balance;
    }
}

class BankAccountDriver {
    public static void main(String[] args) {
        BankAccount abbyAccount = new BankAccount();
        System.out.println("My Initial Account Balance Kshs. " + abbyAccount.getBalance());

        abbyAccount.myDeposit();
        abbyAccount.myDeposit();
        abbyAccount.myDeposit();
        abbyAccount.myDeposit();
        System.out.println("My Account Balance after 4 Deposits Kshs. " + abbyAccount.getBalance());

        abbyAccount.myWithdrawal();
        System.out.println("My Account Balance after 1 Withdrawal Kshs. " + abbyAccount.getBalance());

    }
}

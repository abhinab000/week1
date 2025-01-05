package week4;

public class BankAccount {
    private double balance;

    public BankAccount() {
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrew: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient funds. Withdrawal not processed.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        
        BankAccount account = new BankAccount();

        
        System.out.println("Initial Balance: " + account.getBalance());

        
        account.deposit(500.0);
        System.out.println("Balance after deposit: " + account.getBalance());

        
        account.withdraw(200.0);
        System.out.println("Balance after withdrawal: " + account.getBalance());

        
        account.withdraw(400.0);

       
        account.deposit(-50.0);

        account.withdraw(-20.0);

        
        System.out.println("Final Balance: " + account.getBalance());
    }
}

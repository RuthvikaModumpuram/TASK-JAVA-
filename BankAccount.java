public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    public void displayDetails() {
        System.out.println("Bank Account Details:");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("123456789", 500.00);
        account1.displayDetails();

        account1.deposit(200.00);
        System.out.println("\nAfter deposit:");
        account1.displayDetails();
    }
}


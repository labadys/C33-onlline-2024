package lesson_6;

public class CreditCard {
    private final String accountNumber;
    private double balance;

    public CreditCard(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount < 0) {
            balance += amount;
            System.out.println("To the account " + accountNumber + " сredited " + amount + "BYN");
        } else {
            System.out.println("The amount to be credited must be greater than 0");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Fom the account " + accountNumber + " removed " + amount + "BYN");
        } else if (amount > balance) {
            System.out.println("Insufficient funds in the account" + accountNumber);
        } else {
            System.out.println("The withdrawal amount must be greater than 0");
        }
    }

    public void printaccountInformation() {
        System.out.println("---------------------------------------------------------\n№ accounts: " + accountNumber + " balance " + balance + " BYN");
    }
}

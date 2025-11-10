package b.oop.practice;

public class BankAccount {
    String accountNumber;
    int balance;

    public BankAccount(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(int amount) {
        balance += amount;
        System.out.println("잔액" + this.balance);

    }
    void withdraw(int amount) {
        if (balance >= amount) {
        balance -= amount;
        } else {
            System.out.println("No Money");
        }
        System.out.println("잔액"+this.balance);

    }
    public int getBalance() {
        return balance;
    }

}

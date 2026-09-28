package basics.OOPs;

public class BankAccoountMain {
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount();

        a1.accountHolder = "Harish";
        a1.accountNumber = 1001;
        a1.balance = 0;

        a1.deposit(5000);
        a1.withdraw(2000);
        a1.displayBalance();
    }
}

class BankAccount {
    String accountHolder;
    int accountNumber;
    int balance;

    void deposit(int amount) {
        balance = balance + amount;
    }

    void withdraw(int amount) {
        balance = balance - amount;
    }

    void displayBalance() {
        System.out.println("Final Balance :" + balance);
    }
}

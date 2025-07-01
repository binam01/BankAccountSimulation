import java.util.ArrayList;

public class Account {
    private String holder;
    private int number;
    private double balance;
    private ArrayList<String> history;

    public Account(String holder, int number) {
        this.holder = holder;
        this.number = number;
        this.balance = 0;
        this.history = new ArrayList<>();
        history.add("Account created for " + holder + " (A/C: " + number + ")");
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            history.add("Deposited: $" + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            history.add("Withdrawn: $" + amount);
        } else {
            history.add("Failed withdrawal: $" + amount);
        }
    }

    public double getBalance() {
        return balance;
    }

    public ArrayList<String> getHistory() {
        return history;
    }

    public String getHolder() {
        return holder;
    }

    public int getNumber() {
        return number;
    }
}



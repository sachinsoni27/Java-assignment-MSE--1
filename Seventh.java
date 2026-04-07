// 7. Create a class BankAccount with deposit and withdraw methods. 
// Maintain balance inside the class. Demonstrate object behavior.
public class Seventh {
    private double balance;

    // Constructor to initialize the balance
    public Seventh(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    // Method to display current balance
    public void displayBalance() {
        System.out.println("Current balance: $" + balance);
    }

    public static void main(String[] args) {
        // Create an object of the BankAccount class
        Seventh account = new Seventh(1000.0); // Initial balance of $1000

        // Demonstrate object behavior
        account.displayBalance();
        account.deposit(500.0);
        account.displayBalance();
        account.withdraw(200.0);
        account.displayBalance();
    }
}

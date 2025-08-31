import java.util.Scanner;

class ATM {
    double balance;

    // Constructor to set initial balance
    ATM(double balance) {
        this.balance = balance;
    }

    // Method to check balance
    void checkBalance() {
        System.out.println("Your current balance is: ₹" + balance);
    }

    // Method to deposit amount
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited successfully!");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw amount
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully!");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
}

public class SimpleATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ATM atm = new ATM(1000); // Start with ₹1000 balance
        int choice;

        do {
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    atm.checkBalance();
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ₹");
                    double depositAmt = sc.nextDouble();
                    atm.deposit(depositAmt);
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ₹");
                    double withdrawAmt = sc.nextDouble();
                    atm.withdraw(withdrawAmt);
                    break;
                case 4:
                    System.out.println("Thank you for using ATM!");
                    break;
                default:
                    System.out.println("Invalid option! Try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}

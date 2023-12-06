import java.util.Scanner;

class BankAccount {
    private String accountNumber;
    private String pin;
    private double balance;

    public BankAccount(String accountNumber, String pin, double balance) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = balance;
    }

    public boolean validatePin(String enteredPin) {
        return pin.equals(enteredPin);
    }

    public double checkBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. New balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    // Added method to get account number
    public String getAccountNumber() {
        return accountNumber;
    }
}

public class ATM {
    public static void main(String[] args) {
        // Sample account details
        BankAccount userAccount = new BankAccount("123456", "1234", 1000.0);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account number: ");
        String enteredAccountNumber = scanner.next();

        System.out.print("Enter PIN: ");
        String enteredPin = scanner.next();

        if (enteredAccountNumber.equals(userAccount.getAccountNumber()) && userAccount.validatePin(enteredPin)) {
            displayMenu(userAccount);
        } else {
            System.out.println("Invalid account number or PIN. Exiting.");
        }
    }

    private static void displayMenu(BankAccount account) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Current balance: " + account.checkBalance());
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    account.withdraw(withdrawalAmount);
                    break;
                case 4:
                    System.out.println("Exiting. Thank you!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}

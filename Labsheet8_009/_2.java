import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    double calculateInterest();
    double viewBalance();
}

class SavingsAccount implements Account {
    private double balance;

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    @Override
    public double calculateInterest() {
        return balance * 0.05; 
    }

    @Override
    public double viewBalance() {
        return balance;
    }

    
    public void applyBonus() {
        balance += 1000; 
    }
}

class CurrentAccount implements Account {
    private double balance;

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    @Override
    public double calculateInterest() {
        
        return 0;
    }

    @Override
    public double viewBalance() {
        return balance;
    }

    public void overdraft() {
        balance -= 10000; 
    }
}

class Bank {
    private List<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void deposit(int accountIndex, double amount) {
        Account account = accounts.get(accountIndex);
        account.deposit(amount);
    }

    public void withdraw(int accountIndex, double amount) {
        Account account = accounts.get(accountIndex);
        account.withdraw(amount);
    }

    public double calculateInterest(int accountIndex) {
        Account account = accounts.get(accountIndex);
        return account.calculateInterest();
    }

    public double viewBalance(int accountIndex) {
        Account account = accounts.get(accountIndex);
        return account.viewBalance();
    }
}

public class _2 {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("===== Banking System Menu =====");
            System.out.println("1. Add Savings Account");
            System.out.println("2. Add Current Account");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Calculate Interest");
            System.out.println("6. View Balance");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    Account savingsAccount = new SavingsAccount();
                    bank.addAccount(savingsAccount);
                    System.out.println("Savings Account added successfully!");
                    break;
                case 2:
                    Account currentAccount = new CurrentAccount();
                    bank.addAccount(currentAccount);
                    System.out.println("Current Account added successfully!");
                    break;
                case 3:
                    System.out.print("Enter account index: ");
                    int depositAccountIndex = scanner.nextInt();
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    bank.deposit(depositAccountIndex, depositAmount);
                    System.out.println("Amount deposited successfully!");
                    break;
                case 4:
                    System.out.print("Enter account index: ");
                    int withdrawAccountIndex = scanner.nextInt();
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    bank.withdraw(withdrawAccountIndex, withdrawAmount);
                    System.out.println("Amount withdrawn successfully!");
                    break;
                case 5:
                    System.out.print("Enter account index: ");
                    int interestAccountIndex = scanner.nextInt();
                    double interest = bank.calculateInterest(interestAccountIndex);
                    System.out.println("Interest calculated: INR" + interest);
                    break;
                case 6:
                    System.out.print("Enter account index: ");
                    int balanceAccountIndex = scanner.nextInt();
                    double balance = bank.viewBalance(balanceAccountIndex);
                    System.out.println("Account balance: INR" + balance);
                    break;
                case 7:
                    exit = true;
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println();
        }

        scanner.close();
    }
}

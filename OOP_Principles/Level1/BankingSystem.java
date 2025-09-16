abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getAccountNumber() { return accountNumber; }
    public String getHolderName() { return holderName; }
    public double getBalance() { return balance; }

    public void deposit(double amount) { balance += amount; }
    public void withdraw(double amount) { if (balance >= amount) balance -= amount; }

    public abstract double calculateInterest();
}

interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(String acc, String name, double bal) { super(acc, name, bal); }
    @Override
    public double calculateInterest() { return getBalance() * 0.04; }
    @Override
    public void applyForLoan(double amount) { System.out.println("Savings loan applied: " + amount); }
    @Override
    public boolean calculateLoanEligibility() { return getBalance() > 5000; }
}

class CurrentAccount extends BankAccount implements Loanable {
    public CurrentAccount(String acc, String name, double bal) { super(acc, name, bal); }
    @Override
    public double calculateInterest() { return getBalance() * 0.01; }
    @Override
    public void applyForLoan(double amount) { System.out.println("Current loan applied: " + amount); }
    @Override
    public boolean calculateLoanEligibility() { return getBalance() > 10000; }
}

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount[] accounts = {
            new SavingsAccount("SAV123", "Alice", 10000),
            new CurrentAccount("CUR456", "Bob", 20000)
        };
        for (BankAccount acc : accounts) {
            System.out.println(acc.getHolderName() + " Interest: " + acc.calculateInterest());
            ((Loanable)acc).applyForLoan(5000);
            System.out.println("Eligible: " + ((Loanable)acc).calculateLoanEligibility());
        }
    }
}

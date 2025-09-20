class BankAccount {
    String accountNumber;
    double balance;
    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}
class SavingsAccount extends BankAccount {
    double interestRate;
    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
    void displayAccountType() {
        System.out.println("SavingsAccount " + interestRate);
    }
}
class CheckingAccount extends BankAccount {
    double withdrawalLimit;
    CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }
    void displayAccountType() {
        System.out.println("CheckingAccount " + withdrawalLimit);
    }
}
class FixedDepositAccount extends BankAccount {
    int depositTerm;
    FixedDepositAccount(String accountNumber, double balance, int depositTerm) {
        super(accountNumber, balance);
        this.depositTerm = depositTerm;
    }
    void displayAccountType() {
        System.out.println("FixedDepositAccount " + depositTerm);
    }
}
class BankAccountTypes {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("SA123", 10000, 4.5);
        CheckingAccount ca = new CheckingAccount("CA456", 5000, 2000);
        FixedDepositAccount fda = new FixedDepositAccount("FDA789", 20000, 12);
        sa.displayAccountType();
        ca.displayAccountType();
        fda.displayAccountType();
    }
}
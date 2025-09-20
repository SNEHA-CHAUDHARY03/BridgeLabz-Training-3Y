// BankAccountTest.java
// Test class for Bank Account Types
public class BankAccountTest {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("SA123", 10000, 4.5);
        CheckingAccount ca = new CheckingAccount("CA456", 5000, 2000);
        FixedDepositAccount fda = new FixedDepositAccount("FDA789", 20000, 12);

        sa.displayAccountType();
        ca.displayAccountType();
        fda.displayAccountType();
    }
}
package Object_Oriented.Encapsulation;
abstract class BankAccount {
    private String accountNumber;
    protected double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    abstract double calculateInterest();
}

interface Loanable {
    void applyForLoan();
}


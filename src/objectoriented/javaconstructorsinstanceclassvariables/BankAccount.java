package objectoriented.javaconstructorsinstanceclassvariables;

class BankAccount {
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    public void setBalance(double b) {
        balance = b;
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    void display() {
        System.out.println("Account No: " + accountNumber);
        System.out.println("Holder: " + accountHolder);
    }

    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount();
        s.accountNumber = 12345;
        s.accountHolder = "Nehaa";
        s.setBalance(10000);

        s.display();
        System.out.println("Balance: " + s.getBalance());
    }
}


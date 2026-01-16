package Object_Oriented.Java_Class_And_Object.level2;
class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.accountHolder = "Nehaa";
        acc.accountNumber = 1001;
        acc.balance = 5000;

        acc.deposit(2000);
        acc.withdraw(3000);
        acc.displayBalance();
    }
}


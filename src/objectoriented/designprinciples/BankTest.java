package Object_Oriented.DesignPrinciples;
class Bank {
    String bankName;

    Bank(String bankName) {
        this.bankName = bankName;
    }

    void openAccount(Customer customer) {
        System.out.println(customer.name + " opened account in " + bankName);
    }
}

class Customer {
    String name;
    double balance;

    Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    void viewBalance() {
        System.out.println(name + "'s balance: ₹" + balance);
    }
}

public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank("SBI");
        Customer c1 = new Customer("Nehaa", 10000);

        bank.openAccount(c1);
        c1.viewBalance();
    }
}


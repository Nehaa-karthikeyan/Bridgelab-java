package objectoriented.keywords.Level1;
class BankAccount {
    static String bankName = "ABC Bank";
    static int totalAccounts = 0;

    String accountHolderName;
    final int accountNumber;

    BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    void display(Object obj) {
        if (obj instanceof BankAccount) {
            System.out.println(accountHolderName + " | " + accountNumber);
        }
    }

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Nehaa", 101);
        b1.display(b1);
        BankAccount.getTotalAccounts();
    }
}


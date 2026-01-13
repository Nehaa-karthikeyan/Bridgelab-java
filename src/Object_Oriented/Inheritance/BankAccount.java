package Object_Oriented.Inheritance;
class BankAccount {
    int accountNumber;
    double balance;
}

class SavingsAccount extends BankAccount {
    double interestRate;
}

class CheckingAccount extends BankAccount {
    int withdrawalLimit;
}

class FixedDepositAccount extends BankAccount {
    int lockPeriod;
}


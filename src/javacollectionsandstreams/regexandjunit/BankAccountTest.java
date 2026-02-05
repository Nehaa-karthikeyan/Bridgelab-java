package javacollectionsandstreams.regexandjunit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    // ---- Class ----
    class BankAccount {
        double balance = 0;

        void deposit(double amount) {
            balance += amount;
        }

        void withdraw(double amount) {
            if (amount > balance)
                throw new IllegalArgumentException("Insufficient funds");
            balance -= amount;
        }

        double getBalance() {
            return balance;
        }
    }

    @Test
    void testDepositAndWithdraw() {
        BankAccount acc = new BankAccount();
        acc.deposit(100);
        acc.withdraw(40);
        assertEquals(60, acc.getBalance());
    }

    @Test
    void testInsufficientBalance() {
        BankAccount acc = new BankAccount();
        assertThrows(IllegalArgumentException.class,
                () -> acc.withdraw(50));
    }
}


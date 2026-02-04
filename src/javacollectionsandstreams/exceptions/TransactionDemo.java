package javacollectionsandstreams.exceptions;

class TransactionException extends Exception {
    public TransactionException(String msg) {
        super(msg);
    }
}

class TransactionService {

    void processTransaction(int amount) throws TransactionException {
        try {
            if (amount <= 0) {
                throw new IllegalArgumentException("Invalid amount");
            }
            System.out.println("Transaction successful: " + amount);
        } catch (IllegalArgumentException e) {
            throw new TransactionException(
                    "Transaction failed for amount: " + amount
            );
        }
    }

    public static void main(String[] args) {
        TransactionService ts = new TransactionService();

        try {
            ts.processTransaction(-100);
        } catch (TransactionException e) {
            System.out.println(e.getMessage());
        }
    }
}


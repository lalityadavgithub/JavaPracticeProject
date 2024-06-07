package JavaDailyPractice;

import java.util.UUID;

public class generateRandomNumber {
    public static void main(String[] args) {


        String transactionId = TransactionIdGenerator.generateTransactionId();
        System.out.println("TxnId: "+transactionId);
    }
}

package JavaDailyPractice;

import java.util.Random;
import java.util.UUID;

public class TransactionIdGenerator {
    private static final Random random = new Random();

    public static String generateTransactionId() {
        int transactionId = 10000 + random.nextInt(90000); // This will generate a random number between 10000 and 99999
        return String.valueOf(transactionId);
    }}

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transaction {
    private LocalDateTime date;
    private String transactionType;
    private BankAccount amount;

    public Transaction(int date, String transactionType, BankAccount amount) {
        this.date = LocalDateTime.now();
        this.transactionType = transactionType;
        this.amount = amount;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public BankAccount getAmount() {
        return amount;
    }

    public String getFormattedDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-mm-dd:mm:ss");
        return date.format(formatter);
    }

}

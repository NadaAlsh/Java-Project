import java.time.LocalDateTime;

public class Transaction {

       private LocalDateTime date;
       private String transactionType;
       private double amount;
    
       // Constructors
    public Transaction(LocalDateTime date, String transactionType, double amount) {
        this.date = date;
        this.transactionType = transactionType;
        this.amount = amount;
    }

    // getter and setter
    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

     public double getAmount() {
         return amount;
     }
     
     public void setAmount(double amount) {
         this.amount = amount;
     }
    }


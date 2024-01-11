import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class BankAccount {

    private int accountNumber;
    private double balance;
    private List<String> transactionHistory;

    // constructor
    public BankAccount(int accountNumber, double balance) {
    this.accountNumber = accountNumber;
    this.balance = balance;
    this.transactionHistory = new ArrayList<>();
    }

    // Getters
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public List<String> getTransactionHistory() {
        return transactionHistory;
    }

    public void setTransactionHistory(List<String> transactionHistory) {
        this.transactionHistory = transactionHistory;
    }

    // method to deposit money 
    public void deposit(double amount){
        if (amount > 0 ){
            balance += amount;
            transactionHistory.add("Deposit: " + amount);
            System.out.println("Deposit succesfull!! \n New balance : " + balance);
        } else {
            System.out.println("Invalid Deposit amount");
        }
    }

        // method to withdraw
        public void withdrawal(double amount){
            if (amount > 0 && amount <= balance){
                balance -= amount;
                String withdrawalTransaction = "Date: " + LocalDateTime.now() + "\n Type: Withdrawal " + "\n Amount: " +amount;
                transactionHistory.add("Withdrawl: " + amount);
            } else {
                System.out.println("Invalid withdrawal amount");
            }
        }
        // method to display transaction history
        public void displayTransactionHistory(){
            System.out.println("Transaction History for Account " + accountNumber + ": ");
            for (String transaction : transactionHistory){
                System.out.println(transaction);
            }
        }
    
        public void setPassword(String password) {
        }     
}
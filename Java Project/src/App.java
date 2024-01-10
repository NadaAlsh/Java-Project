
public class App {
    public static void main(String[] args) throws Exception {

        BankAccount razansAccount = new BankAccount(1234, 1000);

        razansAccount.deposit(50);
        razansAccount.withdrawal(30);
        razansAccount.displayTransactionHistory();

        System.out.println("Current balance: KD" + razansAccount.getBalance());
        System.out.println("Account number: " + razansAccount.getAccountNumber());

    }
}

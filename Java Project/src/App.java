// import java.util.Scanner;
// import java.io.Console;

// public class App {
//     public static void main(String[] args) throws Exception {
// // Section BankAccount

//         BankAccount razansAccount = new BankAccount(1234, 1000);
        
//         razansAccount.deposit(50);
//         razansAccount.withdrawal(30);
//         razansAccount.displayTransactionHistory();

//         System.out.println("Current balance: " + razansAccount.getBalance() + " KD");
//         System.out.println("Account number: " + razansAccount.getAccountNumber());

// //-----------------------------------------------------------------------------

// // Section User

//         User user = new User("Razan", "Password123", razansAccount);
//         Scanner scanner = new Scanner(System.in);


//         user.getAccount().deposit(200.0);
//         user.getAccount().withdrawal(50.5);
//         user.getAccount().displayTransactionHistory();


//         System.out.println("Current balance: " + user.getAccount().getBalance() + " KD");
//         System.out.println("Account number: " + user.getAccount().getAccountNumber());

//         user.changePassword("New Password");
//         //String enteredPassword = promptForPassword();
//         String newPassword = promptForPassword();

//         user.changePassword(newPassword);

//         scanner.close();

//     } // end of MAIN
//  //METHODS

// //User Method 
//     private static String promptForPassword() {
//         Console console = System.console();
//         if (console != null) {
//             char[] passwordChars = console.readPassword("Enter your password: ");
//             return new String(passwordChars);
//         } else {
//             Scanner scanner = new Scanner(System.in);
//             System.out.println("Enter your password: ");
//             return scanner.nextLine();
//         }
//     }

// //--------------------------

// }





import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.util.jar.Manifest;
import java.io.Console;

public class App {
    public static void main(String[] args) throws Exception {

        // Ojbject:
        // Object for BankAccount
        BankAccount razansAccount = new BankAccount(1234, 1000);
        // Object for User
        User user = new User("Razan", "Password123", razansAccount);
        Scanner scanner = new Scanner(System.in);

        razansAccount.deposit(50);
        razansAccount.withdrawal(30);
        razansAccount.displayTransactionHistory();

        user.getAccount().deposit(200.0);
        user.getAccount().withdrawal(50.5);

        // display transaction and update user information 
        displayTransactionDetails(user.getAccount().getLastTransaction());
        displayUserInfo(user);

        //close scanner
        scanner.close();

    }

    // method to display user information 
    private static void displayUserInfo(User user){
        System.out.println("Transaction History for Account " + user.getAccount().getAccountNumber() + ":");
        user.getAccount().displayTransactionHistory();
        System.out.println("Current balance: " + user.getAccount().getBalance() + "KD");
        System.out.println("Account number: " + user.getAccount().getAccountNumber());
    }

    // method to display transaction history
    private static void displayTransactionDetails(Transaction transaction){
        System.out.println("Transaction Details: ");
        System.out.println("Date: " + transaction.getFormattedDate());
        System.out.println("Type: " + transaction.getTransactionType());
        System.out.println("Amount: " + transaction.getAmount() + "KD");
    }
}
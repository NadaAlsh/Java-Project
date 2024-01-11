import java.util.Scanner;
import java.io.Console;
import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Bank account 
        BankAccount razansAccount = new BankAccount(1234, 1000);

        // create user with bank account 
        User user = new User("Razan","Razan123",razansAccount);


        
        
        //ask user to enter username and password ( the password will be hidden while writing in output) 
        Scanner scanner = new Scanner(System.in);
        Console console = System.console();
        
        System.out.println("Enter username: ");
        String enterdUsername = scanner.nextLine();
        
        char[] enteredPasswordChars;
        
        if(console != null){
            // use console for pass input
            enteredPasswordChars = console.readPassword("Enter Password (For privacy reasons password will be hidden): ");
        } else {
            System.out.println("Enter password (For privacy reasons password will be hidden): ");
            enteredPasswordChars = scanner.nextLine().toCharArray();
        }
        
        String enteredPassword = new String(enteredPasswordChars);
        
        // System.out.println("Enter password: ");
        // String enteredPassword = scanner.nextLine();
        
        // validating username and password
        if(enterdUsername.equals(user.getUsername()) && enteredPassword.equals(user.getPassword())){
            System.out.println("Login Successful!");
            
            
            //Loop
            char continueTransaction = 'Y';
            do {
                System.out.println("Choose an action: \n 1. Deposit \n 2. Withdrawal");
                
                int choice = scanner.nextInt();
                
                if(choice == 1){
                    //deposit
                    System.out.println("Enter Deposit Amount: ");
                    double depositAmount = scanner.nextDouble();
                    user.getAccount().deposit(depositAmount);
                } else if (choice == 2) {
                    //withdrawal
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    user.getAccount().withdrawal(withdrawalAmount);
                } else {
            System.out.println("Invalid choice. Please Enter 1 or 2.");
            continue;
        }
        
        System.out.println("Do you need any other transaction? Yes[Y] / No[N]");
        continueTransaction = scanner.next().charAt(0);
        
    } while (continueTransaction == 'Y' || continueTransaction == 'y');
    
    // testing bank acc functionalities
    System.out.println("New balance: " + user.getAccount().getBalance());
    
    //display transaction history
    System.out.println("Transaction History: ");
    for (String transaction : user.getAccount().getTransactionHistory()){
        System.out.println(transaction);
    }
    
    
    System.out.println("Goodbye! See you again.");
} else {
    System.out.println("Invalid username or password. Login failed.");
}




scanner.close();
}


}
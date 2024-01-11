
public class User {
    

    private String username;
    private String password;
    private BankAccount account;

    //Constructors
    public User(String username, String password, BankAccount account) {
        this.username = username;
        this.password = password;
        this.account = account;
    

      
    }
    // Getters and Setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public BankAccount getAccount() {
        return account;
    }

    public void setAccount(BankAccount account) {
        this.account = account;
    }

    private void setPassword(String password) {
        if (isValidPassword(password)) {
            this.password = password;
        } else {
            System.out.println("INVALID PASSWORD \n Passowrd not changed");
            }
    }

        // method to check if password is valid 
        private boolean isValidPassword(String newPassword) {
            return newPassword.length() >= 6;
        }

    
}


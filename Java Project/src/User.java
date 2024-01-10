public class User {
    private String username;
    private String password;
    private BankAccount account;

    public User(String username, String password, BankAccount account) {
        this.username = username;
        this.setPassword(password);
        this.account = account;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public BankAccount getAccount() {
        return account;
    }

    public void changePassword(String newPassword) {
        if (isValidPassword(newPassword)) {
            password = newPassword;
            System.out.println("Password Changed Successfully");
        } else {
            System.out.println("Invalid password! Password should be at least 6 characters long");
        }
    }

    private boolean isValidPassword(String newPassword) {
        return newPassword.length() >= 6;
    }

    private void setPassword(String password) {
        if (isValidPassword(password)) {
            this.password = password;
        } else {
            System.out.println("INVALID PASSWORD \n Passowrd not changed");
        }
    }

}

public class BankSingleton {
    private static BankSingleton instance;

    public static BankSingleton getInstance() {
        if (instance == null) {
            instance = new BankSingleton();
        }
        return instance;
    }

    public boolean authenticateUser(String username, String password) {
        String validUsername = "Nada";
        String validPassword = "DefaultPassword";
        return username.equals(validUsername) && password.equals(validPassword);

    }
}

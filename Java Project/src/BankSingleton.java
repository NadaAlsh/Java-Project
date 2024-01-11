public class BankSingleton {
        private static BankSingleton instance;
        
        public static BankSingleton getInstance() {
            if (instance == null) {
                instance = new BankSingleton();
            }
            return instance;
        }
        
    public boolean authenticateUser(String username, String password){
        
        String validUsername = "Razan";
        String validPassword = "Razan123";
        return username.equals(validUsername) && password.equals(validPassword);
        
        }

        public User createBankAccount(String username, String password, int accountNumber, double initialBalance){
            // check if username is unique
            if(isUsernameUnique(username)){
                // create new bank account
                BankAccount newAccount = new BankAccount(accountNumber, initialBalance);

                // create new user
                User newUser = new User(username, password, newAccount);

                // add username to set existing username
                existingUsernames.add(username);
                return newUser;
            }else{
                throw new IllegalArgumentException("Username is used");
            }
        }
}
        


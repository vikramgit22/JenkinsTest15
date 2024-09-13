package OOPS.encap;

// Main class to test encapsulation
public class EncapD {
    public static void main(String[] args) {
        // Creating an object of BankAccount
        BankAccount account = new BankAccount("123456", "John Doe", 1000.0);

        // Accessing and modifying the fields through methods
        account.displayAccountInfo();
        account.deposit(500.0);          // Deposits 500.0 to the account
        account.withdraw(200.0);         // Withdraws 200.0 from the account
        account.setAccountHolderName("Jane Doe");// Updates the account holder name


        account.displayAccountInfo();    // Displays updated account information
    }
}


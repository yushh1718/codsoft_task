package Task_3;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500000); // Create an account with an initial balance of 1000
        ATM atm = new ATM(account);
        atm.start();
    }
}

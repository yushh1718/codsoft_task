package Task_3;

public class BankAccount {
    private double balance;
    public BankAccount(double initialBalance){
        if (initialBalance < 0){
            throw new IllegalArgumentException("Initial balance cannot be less than 0.");
        }
        this.balance = initialBalance;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        if (balance > 0){
            balance += amount;
        }
    }

    public void withdraw(double amount){
        if (amount < balance){
            balance -= amount;
        }
    }
}

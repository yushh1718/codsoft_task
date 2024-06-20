package Task_3;

import java.util.*;
public class ATM {
    private BankAccount account;
    public ATM (BankAccount account){
        this.account = account;
    }
    public void checkBalance(){
        System.out.println("Current account balance is: ₹"+ account.getBalance());
    }
    public void deposit(double amount){
        if (amount < 0){
            System.out.println("Amount cannot be less than 0. Please enter a valid amount.");
        } else {
            account.deposit(amount);
            System.out.println("Amount has been successfully deposit.");
            System.out.println("Your current balance is: ₹"+ account.getBalance());
        }
    }

    public void withdraw(double amount){
        if (amount > account.getBalance()){
            System.out.println("Insufficient balance.");
        } else if(amount < 0){
            System.out.println("Invalid amount. Please enter a valid positive number.");
        } else{
            account.withdraw(amount);
            System.out.println("WitGhdrawal successful. Your current balance is: ₹"+account.getBalance());
        }
    }

    public void start(){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Welcome to your Account.");
            System.out.println("1. Check Balance.");
            System.out.println("2. Deposit Amount.");
            System.out.println("3. Withdraw Amount.");
            System.out.println("4. Exit.");
            System.out.print("Please choose an option to proceed further: ");
            int choice = sc.nextInt();
            System.out.println();

            switch (choice){
                case 1:
                    checkBalance();
                    break;

                case 2:
                    System.out.print("Enter amount: ₹");
                    double depositAmount = sc.nextInt();
                    deposit(depositAmount);
                    break;

                case 3:
                    System.out.print("Enter amount ₹");
                    double withdrawAmount = sc.nextInt();
                    withdraw(withdrawAmount);
                    break;

                case 4:
                    System.out.println("Thank you for using ATM. Have a nice day!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");

            }
            System.out.println();
        }
    }
}

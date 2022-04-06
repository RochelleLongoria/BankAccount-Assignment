import java.util.ArrayList;
import java.util.Arrays;

public class BankAccount {
    
// The class should have the following attributes: (double) checking balance, (double) savings balance
    private double checkingBalance;
    private double savingsBalance;
    
    public static int numOfAccounts = 0;
    public static double totalMoney = 0;
    
    // Empty Constructor
    public BankAccount() {
    numOfAccounts++;
    }
    // Constructor 
    // Create a method that will allow a user to deposit money into either the checking or saving, be sure to add to total amount stored.
    public BankAccount(double checkingBalance, double savingsBalance) {
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        numOfAccounts++;
    }
    // Create a getter method for the user's checking account balance.
    public double getCheckingBalance() {
        return this.checkingBalance;
    }

    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }
    // Create a getter method for the user's saving account balance.
    public double getSavingsBalance() {
        return this.savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public void depositChecking(double depositAmount){
        this.checkingBalance += depositAmount;
        System.out.println("Your balance is " + this.checkingBalance);
    }

    public void depositSavings(double depositAmount){
        this.savingsBalance += depositAmount;
        System.out.println("Your balance is " + this.savingsBalance);
    }


// Create a class member (static) that tracks the total amount of money stored in every account created.
    public void getTotalMoney() {
        System.out.println(this.checkingBalance += this.savingsBalance);
    }

    // Create a method to withdraw money from one balance. Do not allow them to withdraw money if there are insufficient funds.
    public void withdrawMoney(double withdrawAmount){
        if(this.checkingBalance >= withdrawAmount){
            this.checkingBalance -= withdrawAmount;
            System.out.println("Your balance is " + this.checkingBalance);
        } 
        else{
            System.out.println("Insufficient Funds, sorry :(");
        }
    }
    

}

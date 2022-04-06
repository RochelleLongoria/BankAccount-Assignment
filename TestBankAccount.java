import java.util.ArrayList;
import java.util.Arrays;

public class TestBankAccount {
    public static void main(String[] args) {

        // #Instances- Instantiating
    BankAccount account1 = new BankAccount();
    BankAccount account2 = new BankAccount(165464.15, 100.00);


    // #Calling Class Methods 
    account1.depositChecking(5.00);
    account2.withdrawMoney(500.00);
    account1.getTotalMoney();
    account2.getTotalMoney();
    }
}
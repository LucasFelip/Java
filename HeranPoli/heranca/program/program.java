package HeranPoli.heranca.program;

import java.util.Locale;

import HeranPoli.heranca.entity.account;
import HeranPoli.heranca.entity.businessAccount;
import HeranPoli.heranca.entity.savingsAccount;

public class program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        supeOver();
    }


    public static void upDown(){
        // Estudo de upcasting and downcasting
        account acc = new account(1001,"Alex",0.0);
        businessAccount bacc = new businessAccount(1002,"Maria",0.0,500.0);
        
        // UPCASTING - assigning attributes from a subclass to a superclass
        account acc1 = bacc;
        account acc2 = new businessAccount(1003,"Bob",0.0,200.0);
        account acc3 = new savingsAccount(1004,"Anna",0.0,0.01);

        // DOWNCASTING - assigning attributes from a superclass to a subclass
        businessAccount acc4 = (businessAccount)acc2; // Manual casting
        acc4.loan(100.0);

        // businessAccount acc5 = (businessAccount)acc3; // Operation is not valid
        // process to check if that variable belongs to the class, using the intanceof operator
        if(acc3 instanceof businessAccount) {
            businessAccount acc5 = (businessAccount)acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        if(acc3 instanceof savingsAccount) {
            savingsAccount acc5 = (savingsAccount)acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }
    }

    public static void supeOver(){
        //Estudo de super e overrider
        account acc1 = new account(1001,"Lucas", 1000.0);
        acc1.withdraw(200.00);
        System.out.println("Balance: " + acc1.getBalance());

        account acc2 = new savingsAccount(1002, "Manu", 1000.0, 0.01);
        acc2.withdraw(200.00);
        System.out.println("Balance: " + acc2.getBalance());

        account acc3 = new businessAccount(1003, "Bob", 1000.0, 500.0);
        acc3.withdraw(200.0);
        System.out.println("Balance: " + acc3.getBalance());
    }
}
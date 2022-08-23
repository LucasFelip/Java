package HeranPoli.heranca.entity;

public class businessAccount extends account {
    private Double loanLimit;

    public businessAccount() {
    }
    
    public businessAccount(int number, String holder, double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(Double amount) {
        if(amount <= loanLimit){
            deposit(amount);
            loanLimit -=amount;
        }
    }

    public void loanBalance(Double amount) {
        if(amount <= loanLimit){
            balance += amount - 10.0; // 10.0 is the transaction rate 
            loanLimit -=amount;
        }
    }

    // avoid overlapping methods with the final
    @Override
    public final void withdraw(double amount) {
        super.withdraw(amount);
        balance -= 2.0;
    }
}
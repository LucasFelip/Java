package HeranPoli.heranca.entity;

// avoid creating subclasses with the final
public final class savingsAccount extends account {
    private Double interestRate;

    public savingsAccount() {
        super();
    }

    public savingsAccount(int number, String holder, double balance, double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance() {
        balance += balance * interestRate;
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }
}
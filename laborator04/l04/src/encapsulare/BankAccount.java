package encapsulare;

public class BankAccount {

    private String accountHolder;
    private double balance;
    private String pin;

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance < 0)
            System.out.println("Balance cannot be negative");

        this.balance = balance;
    }
}

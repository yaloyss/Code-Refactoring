package module6.task6_3;

public class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void chargeCommission()
    {
        double commission = 0.05;
        balance -= balance * commission;
    }

    public double getBalance()
    {
        return balance;
    }
}


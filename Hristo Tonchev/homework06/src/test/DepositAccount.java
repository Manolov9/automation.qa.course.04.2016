package test;

/**
 * Created by Ico on 5/13/2016.
 */
public class DepositAccount extends Account {
    public DepositAccount (Customer customer,double balance,double interest)
    {
        super(customer,balance,interest);
    }
    public DepositAccount deposit(double amount)
    {
        this.balance +=amount;
        return  this;
    }
    @Override
    public double calcualteInterest(double months)
    {
        if (0< this.balance && this.balance < 100)
            return  0;
        return this.calcualteInterest(months);
    }
    @Override
    public String toString()
    {
        return this.toString("Deposit Account");
    }

}

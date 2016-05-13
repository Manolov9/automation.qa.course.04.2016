package test;

/**
 * Created by Ico on 5/13/2016.
 */
public class MortgageAccount extends Account{
    public  MortgageAccount(Customer customer,double balance,double interest){
        super(customer,balance,interest);
    }
    @Override
    public double calcualteInterest(double months)
    {
        if (this.customer instanceof IndividualCustomer)
            return this.calcualteInterest(months-6);

        if (this.customer instanceof CompanyCustomer)
            return  this.calcualteInterest(Math.min(months,12)/2+Math.max(months-12,0));


            return this.calcualteInterest(months);
    }
    @Override
    public String toString()
    {
        return this.toString("mortage Account");
    }
}

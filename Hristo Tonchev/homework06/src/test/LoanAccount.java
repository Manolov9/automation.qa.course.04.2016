package test;

/**
 * Created by Ico on 5/13/2016.
 */
public class LoanAccount extends Account {
    public LoanAccount(Customer customer,double balance, double interest)
    {
        super(customer,balance,interest);
    }

    public LoanAccount(IndividualCustomer nakov, int i) {

    }

    @Override
    public double calcualteInterest(double months)
    {
        if (this.customer instanceof IndividualCustomer)
            return this.calcualteInterest(months-3);

        if (this.customer instanceof CompanyCustomer)
            return this.calcualteInterest(months-2);

        return this.calcualteInterest(months);

    }
    @Override
    public String toString()
    {
        return this.toString("Loan Account");
    }
}

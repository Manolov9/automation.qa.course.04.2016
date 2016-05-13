package test;



/**
 * Created by Ico on 5/13/2016.
 */
public class Program  {




    /*  static void main (String[] args){}
            {
                Account account =new Account() {
                    @Override
                    public double getBalance() {
                        return super.getBalance();
                    }
                };
                Customer customer = new Customer() {
                    @Override
                    public void setName(String name) {
                        super.setName(name);
                    }
                };*/
    private static void Testinterest(Account account){
        double months = 12;
            System.out.println(account.customer);

            for (int i = 1; i< months; i++)
                System.out.println(account.calcualteInterest(i));

            System.out.println();

        }
    static void Main()
    {
        {
            System.out.println("# Bank ");

            System.out.println(
                    new Bank("Prokredit bank ").addAccount(new DepositAccount(new CompanyCustomer("Netreact"),0, .1d).deposit(150).Withdraw(50),
                    new LoanAccount(new IndividualCustomer("Icc"),50, .07d).Withdraw(20),
                    new  MortgageAccount(new IndividualCustomer("gosho"),0, .05d)));

        }
        System.out.println("# Calculate Loan account interest");

        Testinterest(new LoanAccount(new IndividualCustomer("Ico"),100, .2d ));

        Testinterest(new LoanAccount(new IndividualCustomer("Netreact"),100, .03d));

        System.out.println("# Calculate Deposit account interest");

        Testinterest(new DepositAccount(new IndividualCustomer("Ico"),1000, 1d));
        Testinterest(new DepositAccount(new IndividualCustomer("Netreact"),100, .1d));

        System.out.println("# Calculate Mortgage account interest");

        Testinterest(new MortgageAccount(new IndividualCustomer("Ico"),100, .1d));
        Testinterest(new MortgageAccount(new IndividualCustomer("Netreact"),100, .1d));

            }





}


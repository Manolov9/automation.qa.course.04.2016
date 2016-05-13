package test;



import java.util.*;

/**
 * Created by Ico on 5/12/2016.
 */
public abstract class Account {
    public Customer customer;
    public double balance;
    public double interestRate;

    public Account (Customer customer, double balance, double interestRate){
        this.customer=customer;
        this.balance=balance;
        this.interestRate=interestRate;
    }

    public Account() {

    }

    public double getBalance() {
        return balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public Account Withdraw(double amount)
    {
        this.balance -=amount;
        return this;
    }
    public double calcualteInterest(double months)
    {
        if (!(months>0))
            return  0;
        return this.balance * this.interestRate *months;
    }


    /*public String toString() {
        return toString();
    }*/

    public String toString(String type)
    {
        List<String> info = new List<String>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<String> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(String s) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends String> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends String> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public String get(int index) {
                return null;
            }

            @Override
            public String set(int index, String element) {
                return null;
            }

            @Override
            public void add(int index, String element) {

            }

            @Override
            public String remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<String> listIterator() {
                return null;
            }

            @Override
            public ListIterator<String> listIterator(int index) {
                return null;
            }

            @Override
            public List<String> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
        info.add(String.valueOf(null));
        info.add("Type: "+ type);
        info.add("Customer: ");
        info.add(this.customer.toString());
        info.add("Balance: "+ this.balance);
        info.add("Interest Rate: "+this.interestRate);

        return  String.join(System.lineSeparator(), info);
    }

}

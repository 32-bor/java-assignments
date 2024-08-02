package Assignment_8;

public class Q1 {
    public static void main(String[] args) {
        Account acc = new Account(101,"Sukhdeep",100000,5.7);
        System.out.println(acc.getAccountNumber());
        System.out.println(acc);


    }
}

class Account{
    private int accountNumber;
    private String customerName;
    private double balance;
    public static double rateOfInterest;

    Account(int accountNumber, String customerName, double balance, double rateOfInterest){
        this.accountNumber=accountNumber;
        this.customerName=customerName;
        this.balance=balance;
        this.rateOfInterest=rateOfInterest;
    }
    public void setAccountNumber(int accountNumber){
        this.accountNumber=accountNumber;
    }
    public void setCustomerName(String customerName){
        this.customerName=customerName;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public static void setRateOfInterest(double rateOfInterest){
        Account.rateOfInterest=rateOfInterest;
    }
    public double simpleInterest(double time){
        return time*balance*rateOfInterest/100;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    public String getCustomerName(){
        return customerName;
    }
    @Override
    public String toString(){
        return "Account{Account No:"+accountNumber+", Customer Name:"+customerName+", Balance:"+balance+
                ", ROI:"+rateOfInterest+'}';
    }
}

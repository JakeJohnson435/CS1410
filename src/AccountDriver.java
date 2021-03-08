/*
Basic inheritance demonstration
2/21/21
Dr. G
*/


public class AccountDriver
{
    public static void main(String [] args)
    {
//        Account a1 = new Account("checking 101", 100, 200);
//        a1.printAccount();
//
        Account c1 = new Checking("Checking 101", 100, 200);
        c1.printAccount();
        c1.withdraw(50.1);
        c1.printAccount();

        Account s1 = new Savings("Savings 101", 100, 200, 2.3);
        s1.printAccount();

        MoneyMarket m1 = new MoneyMarket("MoneyMarket", 103, 100.20, 2.3, 5);
        m1.printAccount();
        m1.withdraw(50.1);
        m1.printAccount();

        Mortgage mort1 = new Mortgage("Mortgate", 105, 100000.87, 2.2, 600, "123 Main");
        mort1.printAccount();

        //1. Implement all objects below
        //2. Create objects of each class and do a trace
        //3. Implement print methods in each object
        //4. Create a client and give them an account

    }
}


class Account
{
    private String name;
    private int accountNum;
    private double balance;

    public Account(){name=null;balance=0;accountNum=0;}
    public Account(String name, int accountNum, double balance)
    {this.name=name; this.accountNum=accountNum; this.balance=balance;}


    public double getBalance(){return balance;}
    public String getName(){return name;}
    public void setName(String name){this.name=name;}
    public double setBalance(double balance){this.balance=balance;
        return balance;
    }

    public void printAccount()
    {
        System.out.println("Name = " + name);
        System.out.println("Account Number = " + accountNum);
        System.out.println("Balance = " + balance);
    }

    public double withdraw(double withdrawAmount){

        double balance = this.getBalance();
        if (withdrawAmount < balance){
            balance = balance - withdrawAmount;
            System.out.println("You withdrew " + withdrawAmount + "\nYour new balance is " + balance);
            return this.setBalance(balance);
        } else {
            System.out.println("Unable to withdraw that amount. Insufficient funds");
            return this.setBalance(balance);
        }
    }
}

/*a check is an object with an id and amount*/
class Check
{
    int id;
    double amount;
}

/* checking is an account with a check array of size 10*/
class Checking extends Account
{
    Check[] check = new Check[10];

    public Checking(){
        super();
        Check[] cArray = new Check[10];
    }

    public Checking(String name, int accountNum, double balance)
    {super(name, accountNum, balance);}
}

/* savings is an account with an interest rate and accure interest method*/
class Savings extends Account
{
    private double irate;

    public void accurateInterest(){};

    public Savings(){
        super();
        irate = 3.2;
    }

    public Savings(String name, int accountNum, double balance, double irate){
        super(name, accountNum, balance);
        this.irate = irate;
    }

    public void printAccount(){
        super.printAccount();
        System.out.println("Interest rate = " + irate);
    }

//    public double withdraw(double withdrawAmount){
//
//        double balance = this.getBalance();
//        if (withdrawAmount < balance){
//            balance = balance - withdrawAmount;
//            System.out.println("You withdrew " + withdrawAmount + "\nYour new balance is " + balance);
//            return this.setBalance(balance);
//        } else {
//            System.out.println("Unable to withdraw that amount. Insufficient funds");
//            return this.setBalance(balance);
//        }
//    }
}

/*MoneyMarket is a savings account with a withdrawl limit*/
class MoneyMarket extends Savings
{

    int withdrawlLimit;

    public void setWithdrawlLimit(int withdrawlLimit) {
        this.withdrawlLimit = withdrawlLimit;
    }

    public MoneyMarket(){
        super();
        withdrawlLimit = 3;
    }

    public MoneyMarket(String name, int accountNum, double balance, double irate, int withdrawlLimit){
        super(name, accountNum, balance, irate);
        this.withdrawlLimit = withdrawlLimit;
    }

    public void printAccount(){
        super.printAccount();
        System.out.println("Withdraw Limit = " + withdrawlLimit);
    }

//    public double withdraw(double withdrawAmount){
//
//        double balance = this.getBalance();
//        if (withdrawAmount < balance){
//            balance = balance - withdrawAmount;
//            System.out.println("You withdrew " + withdrawAmount + "\nYour new balance is " + balance);
//            return this.setBalance(balance);
//        } else {
//            System.out.println("Unable to withdraw that amount. Insufficient funds");
//            return this.setBalance(balance);
//        }
//    }


}

/*Client is an individual with an account*/
class Client
{}

class Loan extends Account
{
    private double irate;
    private int duration;

    public Loan(){
        super();
        this.irate  = 3.2;
        this.duration = 60;
    }

    public Loan(String name, int accountNum, double balance, double irate, int duration){
        super(name, accountNum, balance);
        this.irate = irate;
        this.duration = duration;
    }

    public void printAccount(){
        super.printAccount();
        System.out.println("Interest Rate = " + irate + "\nLoan Duration = " + duration + " days");
    }
}

class Mortgage extends Loan
{
    private String address;

    public Mortgage(){
        super();
        this.address = "123 Main Street";
    }

    public Mortgage(String name, int accountNum, double balance, double irate, int duration, String address){
        super(name, accountNum, balance,irate,duration);
        this.address = address;
    }

    public void printAccount(){
        super.printAccount();
        System.out.println("Address: " + address);
    }
}


class CD extends Savings
{
    private String maturity;

    public CD(){
        super();
        this.maturity = "Dec 30, 2022";
    }

    public CD(String name, int accountNum, double balance, double irate, String maturity){
        super(name, accountNum, balance, irate);
        this.maturity = maturity;
    }

    public void printAccount(){
        super.printAccount();
        System.out.println("Maturity date = " + maturity);
    }

}


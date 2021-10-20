class Account
{
    private int ID=0;
    private double Balance=0;
    private double annualInterestRate=0;
    private Date dataCreated;
    
    public Account()
    {
        this.ID=0;
        this.balance=0;
        this.annualinterestRate=0;
        this.Date dateCreated=new java.util.Date();
    }
    public Account(double ID,double balance)
    {
        this.ID=ID;
        this.balance=balance;
        this.annualinterestRate=annualinterestRate;
        this.Date dateCreated=new java.util.Date();
    }
    public int getID()
    {
        return ID;
    }
    public void set(int ID ){
        this.ID =ID ;
    }
    public double getbalance()
    {
        return balance;
    }
    public void setbalance(double balance)
    {
        this.balance=balance;
    }
    public double annualInterestRate()
    {
        return annualinterestRate;
    }
    public void setannualInterestRate(double annualInterestRate)
    {
        this.annualInterestRate=annualInterestRate;
    }
    public Date getdateCreated()
    {
        return dateCreated;
    }
    public void setdateCreated(Date dateCreated)
    {
        this.dateCreated=dateCreated;
    }
    public double getMonthlyInterestRate()
    {
        getMonthlyInterestRat/12;
    }
    public double withDraw(double amount)
    {
        if (amount>balance)
        {
            System.out.println("Not Enough");
        }
        else
        {
            balance=balance-amount;
        }
        return balance;
    }
    public double Deposite(double amount)
    {
        balance=balance+amount;
        return balance;
    }
}
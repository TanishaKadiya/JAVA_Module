public class ATM {
    private String name;
    private int accountnumber;
    private int pin;
    private double balance;
    public String getname()
    {
        return name;
    }
    public void setname(String name)
    {
        this.name=name;
    }
    public int getaccountnumber()
    {
        return accountnumber;
    }
    public void setaccountnumber(int accountnumber)
    {
        this.accountnumber=accountnumber;
    }
    public boolean verifypin(int pin)
    {
        if(this.pin==pin)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public void setpin(int pin)
    {
        this.pin=pin;
    }
    public void setbalance(double balance)
    {
        this.balance=balance;
    }
    public double getbalance()
    {
        return balance;
    }
    public int withdraw(int amount)
    {
        if(amount>balance)
        {
            System.out.println("Insufficient balance");
            return 0;
        }
        else
        {
            balance-=amount;
            return amount;
        }
    }
    public double checkbalance()
    {
        return balance;
    }

    
}

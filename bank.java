import java.util.Scanner;
public class bank {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        ATM atm=new ATM();
        System.out.println("Enter your name: ");
        String name=sc.nextLine();
        atm.setname(name);
        System.out.println("Enter your account number: ");
        int accountnumber=sc.nextInt();
        atm.setaccountnumber(accountnumber);
        System.out.println("Set your pin: ");
        int pin=sc.nextInt();
        atm.setpin(pin);
        System.out.println("Set your balance: ");
        double balance=sc.nextDouble();
        atm.setbalance(balance);
        System.out.println("Enter your pin to check balance: ");
        int checkpin=sc.nextInt();
        if(atm.verifypin(checkpin))
            {
                System.out.println("Your balance is "+atm.checkbalance());
            }   
        else
            {
                System.out.println("Incorrect pin");
            }
        System.out.println("Enter your pin to withdraw: ");
        int withdrawpin=sc.nextInt();
        if(atm.verifypin(withdrawpin))
            {
                System.out.println("Enter the amount to withdraw: ");
                int amount=sc.nextInt();
                int withdrawnamount=atm.withdraw(amount);
                if(withdrawnamount>0)
                {
                    System.out.println("You have withdrawn "+withdrawnamount);
                    System.out.println("Your remaining balance is "+atm.checkbalance());
                }
            }   
        else
            {
                System.out.println("Incorrect pin");
            }
            
    }
}

import java.util.Scanner;
public class positiveint {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,count=0;
        System.out.println("Enter a positive integer:");
        n=sc.nextInt();
        if(n<0)
        {
              System.out.println("Invalid input! Please enter a positive integer.");
              return;
         }
         else
         {
            while(n>0)
            {
                n=n/10;
                 count++;
            }
            System.out.println("Number of digits: "+count);
         }
    
    }
    
}

import java.util.Scanner;
public class series_addition {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to add: ");
        int n=sc.nextInt();
        int sum=0;
        sum=n+(n*n)+(n*n*n);
        System.out.println("The sum of the series is: "+sum);
    }
}

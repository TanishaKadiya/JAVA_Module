import java.util.Scanner;
public class sumandaverage {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number 1: ");
        int n1=sc.nextInt();
        System.out.println("Enter the number 2: ");
        int n2=sc.nextInt();
        System.out.println("Enter the number 3: ");
        int n3=sc.nextInt();
        System.out.println("Enter the number 4: ");
        int n4=sc.nextInt();
        System.out.println("Enter the number 5: ");
        int n5=sc.nextInt();
        int sum=n1+n2+n3+n4+n5;
        double average=sum/5.0;
        System.out.println("The sum is: "+sum);
        System.out.println("The average is: "+average);
        


    }
    
}

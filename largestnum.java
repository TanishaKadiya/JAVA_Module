import java.util.Scanner;
public class largestnum {
public static void main(String[] args)
{
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter number 1: ");
    int n1=scanner.nextInt();
    System.out.println("Enter number 2: ");
    int n2=scanner.nextInt();
    System.out.println("Enter number 3: ");
    int n3=scanner.nextInt();
    if(n1>n2 && n1>n3)
    {
        System.out.println("The largest number is: "+n1);
    }
    else if (n2>n1 && n2>n3)
    {
        System.out.println("The largest number is: "+n2);
    }
    else
    {
        System.out.println("The largest number is: "+n3);
    }
}
}
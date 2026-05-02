import java.util.Scanner;
public class printNumber {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = s.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.println(i);
        }
    }
    
}

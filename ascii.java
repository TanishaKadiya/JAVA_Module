import java.util.Scanner;
public class ascii {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        char c;
        System.out.println("Enter a character:");
        c=sc.next().charAt(0);
        int ascii=(int)c;
        System.out.println("ASCII value of "+c+" is: "+ascii);
        
    }
    
}

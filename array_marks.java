import java.util.Scanner;
public class array_marks {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the marks of 5 subjects:");
        int[] marks=new int[5];
        for(int i=0;i<5;i++)
        {
            marks[i]=s.nextInt();
        }
        System.out.println(" ");
        System.out.println("Entered marks are:");
        for(int i=0;i<5;i++)
        {
            System.out.println(marks[i]);
        }
        int sum=0;
        for(int i=0;i<5;i++)
        {
            sum+=marks[i];
        }
        int avg=sum/5;
        System.out.println(" ");
        System.out.println("Average marks: "+avg);
        
    }
}

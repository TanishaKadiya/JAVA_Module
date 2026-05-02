import java.util.Scanner;
import java.util.Arrays;
public class array {
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of the arrray: ");
    int size=sc.nextInt();
    int[][] arr=new int[size][size];
    System.out.println("Enter the elements of the array:");
    for(int i=0;i<size;i++)
    {
        for(int j=0;j<size;j++)
        {
            arr[i][j]=sc.nextInt();
        }
    }
    System.out.println("The elements of the array are:");
    for(int i=0;i<size;i++)
    {
        for(int j=0;j<size;j++)
        {
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
    }
}
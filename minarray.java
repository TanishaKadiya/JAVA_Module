import java.util.Scanner;
import java.util.Arrays;
public class minarray {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int[][] arr=new int[size][size];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
            arr[i][j]=sc.nextInt();
        }
    }
        System.out.println("The elements of the array are: ");
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
            System.out.print(arr[i][j]+" ");
        }        System.out.println();
    }
        int min=arr[0][0];
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
            if(arr[i][j]<min)
            {
                min=arr[i][j];
            }
        }
    }    
        System.out.println("The minimum element in the array is: "+min);
        int max=arr[0][0];
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
            if(arr[i][j]>max)
            {
                max=arr[i][j];
            }
        }
    }
        System.out.println("The maximum element in the array is: "+max);
    }
        
}

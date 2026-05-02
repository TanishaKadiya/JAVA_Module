import java.util.Scanner;
import java.util.Arrays;
public class odd_array {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");   //size of the array
        int size=sc.nextInt();
        int [][] arr=new int[size][size];  //declaration of 2D array
        System.out.println("Enter the elemnts of the array:");
        for(int i=0;i<size;i++)  //input of the array
        {
            for(int j=0;j<size;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("The elements of the array are: ");
        for(int i=0;i<size;i++)  //output of the array
        {
            for(int j=0;j<size;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("The odd elements of the array are: ");
        int sumodd=0;
        for(int i=0;i<size;i++)  //to find odd elements in the array
        {
            for(int j=0;j<size;j++)
            {
        
                if(arr[i][j]%2!=0)
                {
                    System.out.print(arr[i][j]+" ");
                                        sumodd=sumodd+arr[i][j];
                }
            }
                                 
        }
        System.out.println();
        System.out.println("The even elements of the array are: ");
        int sumeven=0;
        for(int i=0;i<size;i++)  //to find even elements in the array
        {
            for(int j=0;j<size;j++)
            {
                if(arr[i][j]%2==0)
                {
                    
                    System.out.print(arr[i][j]+" ");
                    sumeven=sumeven+arr[i][j];
                }

            }
            
            System.out.println();
        }
        System.out.println("Sum of even elements in the array is: "+sumeven);
        System.out.println("Sum of odd elements in the array is: "+sumodd);

    }
}

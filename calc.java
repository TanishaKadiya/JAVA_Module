import java.util.Scanner;
public class calc {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number 1: ");
        int n1=sc.nextInt();
        System.out.println("Enter the number 2: ");
        int n2=sc.nextInt();
        System.out.println("Enter the operator (+, -, *, /): ");
        String operator=sc.next();
        calculator.add(n1, n2);
        calculator.subtract(n1, n2);
        calculator.multiply(n1, n2);
        calculator.div(n1, n2);
        // switch(operator)
        // {
        //     case "+":
        //         System.out.println("Result: "+calculator.add(n1, n2));
        //         break;
        //     case "-":
        //         System.out.println("Result: "+calculator.subtract(n1, n2));
        //         break;
        //     case "*":
        //         System.out.println("Result: "+calculator.multiply(n1, n2));
        //         break;
        //     case "/":
                
        //             System.out.println("Result: "+calculator.div(n1, n2));
                
        //         break;
        //     default:
        //         System.out.println("Invalid operator! Please use +, -, *, or /.");
        // }

    }
    
    
}

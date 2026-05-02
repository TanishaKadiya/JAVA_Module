import java.util.Scanner;
public class car
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("1.SUV");
        System.out.println("2.Sedan");
        System.out.println("3.Hyundai");
        System.out.println("Enter your choice: ");
        int choice=sc.nextInt();
        switch(choice)
        {
            case 1:
                System.out.println("You have selected SUV.");
                displaySuvDetails();
                
                break;
            case 2:
                System.out.println("You have selected Sedan.");
                System.out.println("Model DETAILS:\n");
                System.out.println("1. TATA Tigor.");
                System.out.println("2. TATA Indigo.");
                System.out.println("3. TATA Zest.");
                System.out.println("Enter your choice: ");
                int sedanChoice=sc.nextInt();
                switch(sedanChoice)
                {
                    case 1:
                        System.out.println("You have selected TATA Tigor.");
                        System.out.println("Price: $15,000");
                        break;
                    case 2:
                        System.out.println("You have selected TATA Indigo.");
                        System.out.println("Price: $18,000");
                        break;
                    case 3:
                        System.out.println("You have selected TATA Zest.");
                        System.out.println("Price: $22,000");
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
                break;
            case 3:
                System.out.println("You have selected Hyundai.");
                System.out.println("Model DETAILS:\n");
                System.out.println("1. Hyundai i20.");
                System.out.println("2. Hyundai Creta.");
                System.out.println("3. Hyundai Venue.");
                System.out.println("Enter your choice: ");
                int hyundaiChoice=sc.nextInt();
                switch(hyundaiChoice)
                {
                    case 1:
                        System.out.println("You have selected Hyundai i20.");
                        System.out.println("Price: $18,000");
                        break;
                    case 2:
                        System.out.println("You have selected Hyundai Creta.");
                        System.out.println("Price: $25,000");
                        break;
                    case 3:
                        System.out.println("You have selected Hyundai Venue.");
                        System.out.println("Price: $20,000");
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
                break;
            default:
                System.out.println("Invalid choice.");
        }

    }
    public static void displaySuvDetails() 
{
    Scanner sc = new Scanner(System.in);
    System.out.println("SUV DETAILS:\n");
    System.out.println("1. TATA Harrier.");
    System.out.println("2. TATA Safari.");
    System.out.println("3. TATA Nexon.");
    System.out.println("Enter your choice: ");
    int suvChoice = sc.nextInt();
    switch(suvChoice)
    {
        case 1:
            System.out.println("You have selected TATA Harrier.");
            System.out.println("Price: $25,000");
            break;
        case 2:
            System.out.println("You have selected TATA Safari.");
            System.out.println("Price: $30,000");
            break;
        case 3:
            System.out.println("You have selected TATA Nexon.");
            System.out.println("Price: $20,000");
            break;
        default:
            System.out.println("Invalid choice.");
    }
}

}


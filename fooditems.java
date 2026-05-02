import java.util.Scanner;
public class fooditems{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("1. Pizza");
        System.out.println("2. Burger");
        System.out.println("3. Vadapav");
        System.out.println("4. Dabeli");
        System.out.println("5. pani puri");
        System.out.println("Enter the number of the food item you want to order:");
        int choice=sc.nextInt();
        switch(choice)
        {
            case 1:
                System.out.println("You have ordered pizza.");
                System.out.println("Enter the type of pizza (veg/non-veg):");
                String pizzaType=sc.next();
                if(pizzaType.equalsIgnoreCase("veg"))
                {
                    System.out.println("You have ordered veg pizza.");
                    System.out.println("Price: $26");
                }
                else if(pizzaType.equalsIgnoreCase("non-veg"))
                {
                    System.out.println("You have ordered non-veg pizza.");
                    System.out.println("Price: $30");
                }
                else
                {
                    System.out.println("Invalid pizza type.");
                }

                break;
            case 2:
                System.out.println("You have ordered burger.");
                System.out.println("Enter the type of burger (veg/non-veg):");
                String burgerType=sc.next();
                if(burgerType.equalsIgnoreCase("veg"))
                {
                    System.out.println("You have ordered veg burger.");
                    System.out.println("Price: $10");
                }
                else if(burgerType.equalsIgnoreCase("non-veg"))
                {
                    System.out.println("You have ordered non-veg burger.");
                    System.out.println("Price: $12");
                }
                else
                {
                    System.out.println("Invalid burger type.");
                }
                break;
            case 3:
                System.out.println("You have ordered vadapav.");
                System.out.println("Please enter the quantity:");
                int quantity=sc.nextInt();
                System.out.println("Total price: $"+(quantity*2));
                break;
            case 4:
                System.out.println("You have ordered dabeli.");
                System.out.println("Please enter the quantity:");
                int quantityDabeli=sc.nextInt();
                System.out.println("Total price: $"+(quantityDabeli*3));
                break;
            case 5:
                System.out.println("You have ordered pani puri.");
                System.out.println("Please enter the quantity:");
                int quantityPaniPuri=sc.nextInt();
                System.out.println("Total price: $"+(quantityPaniPuri*1));
                break;
            default:
                System.out.println("Invalid choice.");
        }

    }
}
import java.util.Scanner;
public class numbergame {
    public static void main(String[] args) 
    {
        int n=39,attempts=3;
        int guess=0;
        System.out.println("Welcome to the number guessing game!");
        System.out.println("You have 3 attempts to guess the number between 1 and 100.");
        Scanner s=new Scanner(System.in);
      
            do
            {
                System.out.println("Enter your guess: ");
                guess=s.nextInt();
                    
                if(guess==n)
                {
                    System.out.println("Congratulations! You guessed the number!");
                    break;
                }
                else if(guess<n)
                {
                    System.out.println("Too low! Try again.");
                }
                else
                {
                    System.out.println("Too high! Try again.");
                }
                 attempts--;
                System.out.println("Attempts left: "+attempts);
            }
            while(attempts>0);
            if(attempts==0)
            {
                System.out.println("Game over! The correct number was: "+n);
            }
}
}
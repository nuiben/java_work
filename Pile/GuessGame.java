import java.util.Scanner;

public class GuessGame
{
    public static void main(String[] args)
    {
     Scanner in = new Scanner(System.in);
     int secretNumber = (int)(Math.random() * 10 + 1);
     int usersGuess = 0;

     while (usersGuess != secretNumber)
     {
          System.out.print("Enter your guess: ");
          usersGuess = in.nextInt();
     }

       System.out.println("Correct!");
    }
}
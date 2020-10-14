import java.util.Scanner;

public class bookCompletion
{
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)
    {
        int timeListened, timeLeft, totalTime;
        double percentageComplete;
        
        timeListened = timeToSeconds();
        timeLeft = timeToSeconds();       
        
        totalTime = timeListened + timeLeft;
        percentageComplete = ((double) timeListened / (double) totalTime) * 100;
        System.out.printf("Book Complete Percentage = %4.2f%%", percentageComplete);
        
    }

    public static int timeToSeconds()
    {
        System.out.println("Enter the hours: ");
        int hours = scanner.nextInt();
        System.out.println("Enter the minutes: ");
        int minutes = scanner.nextInt();
        System.out.println("Enter the seconds: ");
        int seconds = scanner.nextInt();
        int timeInSeconds = (hours * 60 * 60) + (minutes * 60) + (seconds);
        
        return timeInSeconds;
    }
}
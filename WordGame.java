import java.util.Scanner;

public class WordGame {
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = in.next();
        int aCount = 0, index = 0;

        while(index < word.length()) 
        {
            if (word.charAt(index) == 'a') 
                {
                aCount++;
                }
        index++;
        }
        
        System.out.printf("There are %d a's in %s\n", aCount, word);
    }
}
import java.util.Scanner;
public class nestedLoop
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter height: ");
        int height = in.nextInt();
        
        for (int y = 1; y <= height; y++)
        {
            for (int x = 1; x <= y; x++)            
            {
                System.out.print("*");
            }
            System.out.println();            
        }
        for (int w = height; w >= 1; w--)
        {
            for (int q = 1; q <= w; q++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
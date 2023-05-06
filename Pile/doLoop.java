import java.util.Scanner;
public class doLoop
{
    public static void main(String[] args)
    {
    String s = "12345";
    int i = 1;
    do
    {
        if (i > 1)   
        {
        System.out.print(s.substring(i, i + 1));
        }
    }
        while (i < 5);
    }
}
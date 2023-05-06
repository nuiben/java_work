import java.util.Scanner;
class ReverseDigits
{
       public static void main(String[] args)
    {
       
       Scanner in = new Scanner(System.in);
       System.out.println("Enter a positive integer: ");
       int n = in.nextInt();
       String nString = String.valueOf(n);
       int nLength = nString.length();
       String newString = "";
        for(int i = 0; i != nLength; i++)
        {
            System.out.println(nString.charAt(nLength - 1 - i));
            newString = newString + nString.charAt(nLength - 1 - i);
            System.out.println(newString);
        }
        int newInt = Integer.parseInt(newString);
        System.out.println();
        System.out.println(newInt);
    }
}
public class E1_2
{
    public static void main(String[] args)
    {
        int a = 1;
        int b = 1;
        while(b < 10)
        {
        b++;
        a = a + b;
        }
        System.out.println("Sum of first ten positive integers: " + a);
    }
}
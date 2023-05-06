public class E1_3
{
    public static void main(String[] args)
    {
        int a = 1;
        int b = 1;
        while(b < 10)
        {
        b++;
        a = a * b;
        }
        System.out.println("Product of first ten positive integers: " + a);
    }
}
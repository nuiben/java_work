public class question10
{
    private static int foo(int x)
    {
        return x + 3;
    }

    private static int x = 3;

    public static void main(String[] args)
    {
        int c = 8;
        int x = 3;
        x = x + foo(c);
        System.out.println(x);
    }
}

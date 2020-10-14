import java.lang.reflect.Field;
public class ExampleProb
{
    public static void main(String[] args)
    {
        int x = (int) Math.round(3.95);
        long y = Math.round(3.95);
        System.out.println(x);
        System.out.println(((Object)y).getClass().getName());
    }
}
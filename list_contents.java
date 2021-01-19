import java.util.ArrayList;

public class list_contents {

    public static void main(String[] args)
    {
        ArrayList<Integer> Array = new ArrayList<Integer>();
        
        for (int i = 1; i < 6; i++)
        {
        Array.add(i);
        System.out.print(i + " ");
        }
        
        for (int x = 4; x > -1; x--)
        {
        Array.add(x);
        System.out.print(x + " ");
        }

        System.out.println();

        for (int h = 0; h < 10; h++)
        {
        System.out.print(Array.get(h) + " ");
        }

        System.out.println();

        for (int i = 1; i < 10; i++)
        {
            Array.set(i, Array.get(i) + Array.get(i-1));
        }

        System.out.println();

        for (int h = 0; h < 10; h++)
        {
        System.out.print(Array.get(h) + " ");
        }

    }
    
}

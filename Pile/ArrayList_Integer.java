import java.util.ArrayList;

public class ArrayList_Integer 
{

    public static void main(String[] args)
    {
        ArrayList<Integer> A = new ArrayList<Integer>();
        
        for (int x = 0; x < 2; x++)
        {
            for (int y = 0; y < 5; y++)
            {
            A.add(y);
            }
        }
    }
    public ArrayList<Integer> arrayListInit()
    {
        ArrayList<Integer> A = new ArrayList<Integer>();
        
        for (int x = 0; x < 2; x++)
        {
            for (int y = 0; y < 5; y++)
            {
            A.add(y);
            System.out.print(y + " ");
            }
        }


        

        return A;
    }
}

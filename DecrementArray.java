//import java.util.Scanner;
class DecrementArray
{
       public static void main(String[] args)
    {
        int searchedValue = 100;
        int pos = 4;
        int length = 10;
        double[] values = {32, 54, 67.5, 29, 34.5, 80, 115, 44.5, 100, 65};
        
        for (int i = pos + 1; i < length; i++)
        {
            values[i - 1] = values[i];
        }
        length--;
        
        for(double element: values)
        {
        System.out.println(element);
        }
        System.out.println("Array Length: " + length);
    }
}
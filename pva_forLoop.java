// Ben Porter | 02-21-2021 
// I wrote this code to see if there is a difference between a for Loop which increments its instance variable using append (i++) vs prepend (++i)
// While this program does not demonstrate the difference between the two methods, it does show that the output of these two loops are identical.

public class pva_forLoop {
    

    public static void main (String[] args) {

        
        int count = 0;
        for (int i = 0; i < 5 ; i++) {
            count++;
            System.out.println("Count value: " + count);
            System.out.println("Append value: " + i);
        }

        count = 0;
        for (int i = 0; i < 5 ; ++i) {
            ++count;
            System.out.println("Count value: " + count);
            System.out.println("Prepend value: " + i);
        }


    }
}
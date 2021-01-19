//***************************************************************
// CLASS: Chapter 6 Driver
//***************************************************************

public class driver 
{
     public static void main(String[] Args) 
     {
          new driver().run();
     }

     public void run() {
          //fivePrime();
          //firstLast();
          //largestInt();
          //arrayReference();
          enhancedLoop();
     }

     //CH-6 Self-Check 1
     public int[] fivePrime() {

          int[] primeNumbers = {2,3,5,7,11};

          //SC 6-2
          /*
          for (int i = 0; i < 2; i++) 
          {
               primeNumbers[4 - i] = primeNumbers[i];
          }
          */
          //Output: 2,3,5,3,2
          

          //SC 6-3
          /*
          for (int i = 0; i < 5; i++) 
          {
               primeNumbers[i]++;
          }
          */
          //Output: 3,4,6,8,12

          for (int i = 0; i < primeNumbers.length; i++) 
          {
               int e = primeNumbers[i];
               System.out.print(e + " | ");
          }
          return primeNumbers;
     }
     //SC 6-4
     public int[] firstLast() 
     {
          int[] values = new int[10];
          values[0] = 10;
          values[values.length-1] = 10;

          for (int i = 0; i < values.length; i++) 
          {
               System.out.print(values[i] + " | ");
          }
          return values;
     }
     //SC 6-5
     public String[] tenWords() 
     {
          String[] words = new String[10];
          return words;
     }
     //SC 6-6
     public String[] yesNo() 
     {
          String[] response = new String[] {"Yes", "No"};
          return response;
     }

     //SC 6-7
     public void largestInt() 
     {
          double x01 = 32, x02 = 54, x03 = 67.5, x04 = 29, x05 = 35, x06 = 80, x07 = 115, x08 = 44.5, x09 = 100, x10 = 65;          
          double largest = in.nextDouble();
          while (in.hasNextDouble()) 
          {
               double input = in.nextDouble();
               if (input > largest) 
               {
                    largest = input;
               }
          }
     }
     //Array Reference 6.1.2
     public void arrayReference() {
          int[] scores = {10, 9, 7, 4, 5};
          int[] values = scores;
          scores[0] = 6;
          System.out.println(values[0]);
     }
     //SC 6-8
     public void enhancedLoop() {
          int counter = 0;
          int[] values = {0, 0, 0};
          for (double element : values)
          {
               //System.out.println(element);
               if (element == 0) { counter++;} //line evaluates to true if the element in the array has a value of 0
          }
          System.out.print(counter);

     }
}


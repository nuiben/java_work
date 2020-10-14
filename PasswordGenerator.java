/**
   This program generates a random password.
*/

import java.util.Scanner;
public class PasswordGenerator
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("How long would you like your password to be?");
      int passwordLength = scan.nextInt();
      String result = makePassword(passwordLength);
      System.out.println(result);
      scan.close();
   }

   /**
      Generates a random password.
      @param length the length of the password
      @return a password of the given length with one digit and one 
      special symbol
   */
   public static String makePassword(int length)
   {
      String password = "";

      // Pick random letters

      for (int i = 0; i < length - 2; i++)
      {
         password = password + randomCharacter("abcdefghijklmnopqrstuvwxyz");
      }

      // Insert two random digits

      String randomDigit = randomCharacter("0123456789");
      password = insertAtRandom(password, randomDigit);
      String randomSymbol = randomCharacter("+-*/?!@#$%&");
      password = insertAtRandom(password, randomSymbol);
      return password;
   }

   /**
      Returns a string containing one character randomly chosen from a given string.
      @param characters the string from which to randomly choose a character
      @return a substring of length 1, taken at a random index
   */
   public static String randomCharacter(String characters)
   {
      int n = characters.length();
      int r = (int)(n * Math.random());
      return characters.substring(r, r + 1);
   }
   
   /**
      Inserts one string into another at a random position.
      @param str the string into which another string is inserted
      @param toInsert the string to be inserted
      @return the result of inserting toInsert into str
   */
   public static String insertAtRandom(String str, String toInsert)
   {
      int n = str.length();
      int r = (int) ((n + 1) * Math.random());
      return str.substring(0, r) + toInsert + str.substring(r);
   }
}

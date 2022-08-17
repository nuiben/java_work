import java.util.Scanner;
import java.util.Arrays;
//import java.util.Random;
import java.util.HashMap;
import java.util.TreeMap;

public class main {
    static Scanner scan = new Scanner(System.in); // Create a Scanner object

    public static void main(String[] args) {
        // Random rand = new Random();
        // int rand_int = rand.nextInt(49);
        HashMap usaCapitals = capitals();
        Object[] keys = usaCapitals.keySet().toArray();
        // Object randomValue = keys[rand.nextInt(keys.length)];
        // String answer = usaCapitals.get(randomValue).toString(); //
        // usaCapitals(randomValue).toString;
        // System.out.println("Enter ther State Capital of " + randomValue); // rand_int
        // String input = scan.nextLine(); // Read user input
        // System.out.println("User entered: " + input); // Output user input

        // Check if answer (input) is equal to usaCapitals[rand_int][1]
        // isCorrect(input, answer);

        // Display Current Contents of Array
        for (int i = 0; i < usaCapitals.size(); i++) {
            System.out.println("Element " + i + ": " + usaCapitals.get(keys[i]));
        }
        // Use a Tree Sort to sort Content by Capital
        // String[][] bubbledCapitals = bubbleSort(usaCapitals);
        TreeMap treeCapitals = treeSort(usaCapitals);

        // Prompt user to enter answers for all state capitals, then display the current
        // int totalCorrect = 0;
        // keys = treeCapitals.keySet().toArray();
        // for (int i = 0; i < treeCapitals.size(); i++) {
        // System.out.println("Enter the State Capital of " + keys[i]);
        // input = scan.nextLine(); // Read user input
        // if (isCorrect(input, treeCapitals.get(keys[i]).toString())) {
        // totalCorrect++;
        // }
        // }
        // // total correct count
        // System.out.println("Your total score was: (" + totalCorrect + "/50)");

        // Prompt user to enter state, return capital of that State
        System.out.println("Look up the State Capital of (enter State name): ");
        String input = scan.nextLine();
        System.out.println("The Capital of " + input + " is " + treeCapitals.get(input));
    }

    public static HashMap capitals() {

        // HashMap of 50 US States and Capitals
        HashMap<String, String> stateCapitals = new HashMap<>();
        stateCapitals.put("Alabama", "Montgomery");
        stateCapitals.put("Alaska", "Juneau");
        stateCapitals.put("Arizona", "Phoenix");
        stateCapitals.put("Arkansas", "Little Rock");
        stateCapitals.put("California", "Sacramento");
        stateCapitals.put("Colorado", "Denver");
        stateCapitals.put("Connecticut", "Hartford");
        stateCapitals.put("Delaware", "Dover");
        stateCapitals.put("Florida", "Tallahassee");
        stateCapitals.put("Georgia", "Atlanta");
        stateCapitals.put("Hawaii", "Honolulu");
        stateCapitals.put("Idaho", "Boise");
        stateCapitals.put("Illinois", "Springfield");
        stateCapitals.put("Indiana", "Indianapolis");
        stateCapitals.put("Iowa", "Des Moines");
        stateCapitals.put("Kansas", "Topeka");
        stateCapitals.put("Kentucky", "Frankfort");
        stateCapitals.put("Louisiana", "Baton Rouge");
        stateCapitals.put("Maine", "Augusta");
        stateCapitals.put("Maryland", "Annapolis");
        stateCapitals.put("Massachusetts", "Boston");
        stateCapitals.put("Michigan", "Lansing");
        stateCapitals.put("Minnesota", "St. Paul");
        stateCapitals.put("Mississippi", "Jackson");
        stateCapitals.put("Missouri", "Jefferson City");
        stateCapitals.put("Montana", "Helena");
        stateCapitals.put("Nebraska", "Lincoln");
        stateCapitals.put("Nevada", "Carson City");
        stateCapitals.put("New Hampshire", "Concord");
        stateCapitals.put("New Jersey", "Trenton");
        stateCapitals.put("New Mexico", "Santa Fe");
        stateCapitals.put("New York", "Albany");
        stateCapitals.put("North Carolina", "Raleigh");
        stateCapitals.put("North Dakota", "Bismarck");
        stateCapitals.put("Ohio", "Columbus");
        stateCapitals.put("Oklahoma", "Oklahoma City");
        stateCapitals.put("Oregon", "Salem");
        stateCapitals.put("Pennsylvania", "Harrisburg");
        stateCapitals.put("Rhode Island", "Providence");
        stateCapitals.put("South Carolina", "Columbia");
        stateCapitals.put("South Dakota", "Pierre");
        stateCapitals.put("Tennessee", "Nashville");
        stateCapitals.put("Texas", "Austin");
        stateCapitals.put("Utah", "Salt Lake City");
        stateCapitals.put("Vermont", "Montpelier");
        stateCapitals.put("Virginia", "Richmond");
        stateCapitals.put("Washington", "Olympia");
        stateCapitals.put("West Virginia", "Charleston");
        stateCapitals.put("Wisconsin", "Madison");
        stateCapitals.put("Wyoming", "Cheyenne");

        return stateCapitals;
    }

    // public static String[][] bubbleSort(String[][] arr) {
    // // Bubble Sort arr
    // int n = arr.length;
    // for (int i = 0; i < n - 1; i++)
    // for (int j = 0; j < n - i - 1; j++)
    // if (arr[j][1].compareTo(arr[j + 1][1]) > 0) {
    // // swap arr[j+1] and arr[j]
    // String[] temp = { arr[j][0], arr[j][1] };
    // arr[j][0] = arr[j + 1][0];
    // arr[j][1] = arr[j + 1][1];
    // arr[j + 1] = temp;
    // }
    // return arr;
    // }

    public static TreeMap treeSort(HashMap hash) {
        Object[] keyset = hash.keySet().toArray();
        TreeMap<String, String> tree = new TreeMap<String, String>();
        for (int i = 0; i < hash.size(); i++) {
            // System.out.println("Element " + i + ": " + hash.get(keyset[i]));
            tree.put(keyset[i].toString(), hash.get(keyset[i]).toString());
        }
        keyset = tree.keySet().toArray();
        for (int i = 0; i < tree.size(); i++) {
            System.out.println("Element " + i + ": " + tree.get(keyset[i]));
        }
        return tree;
    }

    // public static boolean isCorrect(String inp, String ans) {
    // // Check if answer (input) is equal to usaCapitals[rand_int][1]
    // if (inp.equalsIgnoreCase(ans)) {
    // System.out.println("Answer is correct");
    // return true;
    // } else {
    // System.out.println("Answer is incorrect");
    // System.out.println("Expected: " + ans);
    // return false;
    // }
    // }
}

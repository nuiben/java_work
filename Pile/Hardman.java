import java.util.ArrayList;
public class Hardman {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Alice");
        list.add("Bob");
        list.add("Charles");
        list.add("Diane");
        list.add(2,"Evy");
        list.remove(3);
        list.add(list.size(),"Frank");

        for (String num : list) {
            System.out.println(num);
        }
    }
}
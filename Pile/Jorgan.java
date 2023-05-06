public class Jorgan {

    public static void main(String[] args) {
        String s = "Sailor";
        String x = s;
        System.out.println((s==x));

        String a = "Apple";
        String b = "Apple";
        System.out.println((a==b));

        System.out.println(s.equals(x));
        System.out.println(a.equals(b));
    }
}
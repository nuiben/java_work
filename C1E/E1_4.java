public class E1_4
{
    public static void main(String[] args)
    {
        double balance;
        balance = 1000;
        int year;
        year = 0;
        while (year < 3)
        {
            balance = balance * 1.05;
            year++;
            System.out.println("Year = " + year);
            System.out.println("Balance = " + balance);
        }

    }
}
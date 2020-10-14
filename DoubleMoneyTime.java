public class DoubleMoneyTime
{
    public static void main(String[] args)
    {
        double balance;
        balance = 3800;
        int year;
        year = 0;
        while (balance < 5000)
        {
            balance = balance * 1.0325;
            year++;
            System.out.println("Year = " + year);
            System.out.println("Balance = " + balance);
        }

    }
}
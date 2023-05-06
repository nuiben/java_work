public class DepletedAccount
{
    public static void main(String[] args)
    {
        double balance = 10000;
        double month;
        month = 0;
        while (balance > 0)
        {
            balance = balance - 500;
            balance = balance * 1.05;
			month++;
            System.out.println("Month = " + month);
            System.out.println("Balance = " + balance);
        }
        double year = month/12;
        System.out.println("Account depleted after " + year);
        System.out.print(" years.");
    }
}
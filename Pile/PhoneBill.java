public class PhoneBill
{

    public static void main(String[] args)
    {
        
        System.out.println("Enter Minutes Used this Month: ");
        double monthly_minutes = 400;
        double monthly_bill;
        if (monthly_minutes < 300)
        {
            monthly_bill = 29.95;
        } 
        else 
        {
            monthly_bill = ((monthly_minutes-300) * 0.45) + 29.95;
        }
        double total_bill = monthly_bill * 1.125;
        System.out.println("Your total Monthly Bill is: "+ total_bill);
    }
}
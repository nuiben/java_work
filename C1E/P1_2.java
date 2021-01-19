//P1.2 Work Miles vs Personal Miles

public class P1_2
{
    public static void main(String[] args)
    {
        double commuteDistance = 15.3;
        double begOdoReading = 144308;
        double endOdoReading = 144557;
        double milesDriven = endOdoReading - begOdoReading;
        double workMiles = commuteDistance * 2 * 5;
        double personalMiles = milesDriven - workMiles;
        double percentWork = (workMiles/milesDriven)*100;
        double percentPersonal = (personalMiles/milesDriven)*100;
        System.out.print("Percentage driven for work: " + percentWork);
        System.out.println("%");
        System.out.print("Percentage driven for personal use: " + percentPersonal);
        System.out.println("%");
    }
}
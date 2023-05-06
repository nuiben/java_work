public class R1_15
{
    public static void main(String[] args)    
    {
        double width = 30;
        double length = 50;
        double height = 20;
        double window_ct = 6;
        double door_ct = 2;
        double paint_cost = 1.50;
        double door_sa = 32;
        double window_sa = 24;
        System.out.println("This problem estimates the cost of painting a house.");
        System.out.println("The standard surface area of a door is 32 sqft (8x4).");
        System.out.println("The standard surface area of a window is 24 sqft (6x4).");
        System.out.print("Width of house: " + width);
        System.out.println(" feet");
        System.out.print("Length of house: " + length);
        System.out.println(" feet");
        System.out.print("Height of house: " + height);
        System.out.println(" feet");
        System.out.println("Number of doors: " + door_ct);
        System.out.println("Number of windows: " + window_ct);
        System.out.println("Cost per sqft of paint: " + paint_cost);

        double windoor_sqft = (door_sa*door_ct) + (window_sa*window_ct);
        double sqft_estimate = (((length*height) + (width*height))*2) - windoor_sqft;
        double cost_estimate = sqft_estimate*paint_cost;
        System.out.println("Estimated cost of project is : " + cost_estimate);


    }
} 
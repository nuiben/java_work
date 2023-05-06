import java.util.Scanner;
import java.lang.Math;
public class RoboRun
{
    public static void main(String[] args)
    {

        /*
        Problem Statement: A robot needs to retrieve an item located in rocky terrain adjacent to a road. The robot can travel at a faster speed on the road than on the rocky
        terrain, so it will want to do so for a certain distance before moving on a straight line to the item.

        dx = distance from road to item (horizontal axis)
        dy = distance from robot to item (vertical axis)
        s1 = speed on road
        s2 = speed on rocky terrain

        Prompt the user for inputs dx, dy, s1, s2, and l1. Calculate the total time it will take the robot to reach the item.
        */

        //User inputs
        Scanner in = new Scanner(System.in);
        System.out.print("Distance of x: ");
        double xDistance = in.nextDouble();
        System.out.print("Distance of y: ");
        double yDistance = in.nextDouble();
        System.out.print("Speed on road: ");
        double speedRoad = in.nextDouble();
        System.out.print("Speed on rocky terrain: ");
        double speedRocks = in.nextDouble();
        System.out.print("Distance traveled on road: ");
        double roadDistance = in.nextDouble();
        

        //Calculations
        double landDistance = (Math.sqrt(Math.pow(yDistance - roadDistance, 2) + Math.pow(xDistance, 2)));
        double travelTimeRocks = landDistance / speedRocks;
        double travelTimeRoad = roadDistance / speedRoad;
        double totalTravelTime = travelTimeRocks + travelTimeRoad;
        
        System.out.print("The robot will reach the item in " + totalTravelTime);
        System.out.print(" hours.");
    }
}
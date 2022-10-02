import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double inputMeters = 0;
        double outputMiles;
        double outputFeet;
        double outputInches;
        String trash = "";

        //Input in meters
        System.out.print("Enter your measurement in meters: ");
        if(in.hasNextDouble())
        {
            // OK safe to read in a double
            inputMeters = in.nextDouble();
            in.nextLine(); // clears the newline from the buffer
        }
        else
        {
            // Not a double can’t use nextDouble() read as String with nextLine() instead
            trash = in.nextLine();
            System.out.println("\nYou said your measurement was: " + trash);
            System.out.println("Run the program again and enter a valid amount!");
            System.exit(0);  // terminate the program
        }

        // Calculation for miles
        outputMiles = inputMeters / 1609.244;
        System.out.println("Your measurement in miles is " + outputMiles + " miles");

        // Calculation for feet
        outputFeet = inputMeters * 3.2808339895;
        System.out.println("Your measurement in feet is " + outputFeet + " feet");

        // Calculation for inches
        outputInches = inputMeters / 0.0254;
        System.out.println("Your measurement in inches is " + outputInches + " inches");


    }
}
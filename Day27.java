import java.util.Scanner;

//Program to convert centimeter to inch, meter and kilometer
public class Day27 {
    public static void main(String argsp[]) {
        // Initialize objects for reading input
        Scanner input = new Scanner(System.in);

        // Get input from the user in centimeter
        double userInputinCentrimeter = input.nextDouble();
        input.close();

        // convert it to inch
        double OnecentimeterIs_assignedValueInches = 1 / 2.54;
        double convertedInchesFromCentimeter = userInputinCentrimeter / 2.54;

        // convert it to meter

        double convertedMetersFromCentimeter = userInputinCentrimeter / 100;

        // convert it to kilometer

        double convertedKilometersFromCentimeter = userInputinCentrimeter / 100000;

        // Print the computed results to console
        System.out.println(userInputinCentrimeter + " centimeter = " + convertedInchesFromCentimeter + " inches");
        System.out.println(userInputinCentrimeter + " centimeter = " + convertedMetersFromCentimeter + " meters");
        System.out.println(userInputinCentrimeter + " centimeter = " + convertedKilometersFromCentimeter + " kilometers");
    }
}
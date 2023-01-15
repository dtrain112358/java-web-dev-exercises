package exercises;

import java.util.Scanner;

public class milesPerGallon {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?: ");
        double miles = input.nextDouble();
        System.out.println("How much gas did you use on this trip?: ");
        double gasUsed = input.nextDouble();
        double totalMilesPerGallon = miles / gasUsed;
        System.out.println("The total miles per gallon for this trip is: " + " " + totalMilesPerGallon);
        input.close();

    }
}

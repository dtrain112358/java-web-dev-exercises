package exercises;

import java.util.Scanner;


public class areaRectangle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of the rectangle?: ");
        double length = input.nextDouble();
        System.out.println("What is the width of the rectangle?: ");
        double width = input.nextDouble();
        double solution = length * width;
        System.out.println("The area of the rechtangle is: " + " " + solution);
        input.close();




    }
}

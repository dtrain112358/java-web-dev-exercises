package org.launchcode.java.demos.areaifacircle;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Radius of a Circle: ");
        double radius = input.nextDouble();
        double area = (Math.PI) * (radius * radius);
        System.out.println("The Area of a circle of radius" + radius + " is: " + area);
        input.close();





    }
}

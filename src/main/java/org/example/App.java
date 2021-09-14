package org.example;

import java.util.Scanner;

/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Mohammed_Almeaither
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Exercise 7 - Area of a Rectangular Room");
        System.out.print("What is the length of the room in feet? ");
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        System.out.print("What is the width of the room in feet? ");
        int width = in.nextInt();
        int area = length*width;
        double constant_factor = 0.09290304;
        double am2 = (double)area * constant_factor;
        System.out.println("You entered dimensions of "+length + " feet by " + width + " feet");
        System.out.println("The area is "+ area + " square feet");
        System.out.println(am2 + " square meters");
        System.out.println("The formula for this conversion is m2 = f2 × 0.09290304");

    }
}

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 alden bagarra
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scnN = new Scanner(System.in);
        System.out.print( "Press C to convert from Fahrenheit to Celsius." +
                "\nPress F to convert from Celsius to Fahrenheit." +
                "\nYour choice: " );
        String chc = scnN.next();
        if(chc.equalsIgnoreCase("C")){
            System.out.print("Please enter the temperature in Fahrenheit: ");
            int tempF = scnN.nextInt();
            int convC = (tempF - 32)*5/9;
            System.out.print("The temperature in Celsius is "+ convC +".");
        }
        else if(chc.equalsIgnoreCase("F")){
            System.out.print("Please enter the temperature in Celsius: ");
            int tempC = scnN.nextInt();
            int convF = (tempC*9/5)+32;
            System.out.print("The temperature in Fahrenheit is "+ convF +".");
        }
    }
}

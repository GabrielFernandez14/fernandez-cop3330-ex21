/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Gabriel Fernandez
 */

package org.example;
import java.util.Scanner;

public class App 
{

    // Main function
    public static void main( String[] args )
    {
        // Initialize variables
        String month = "";
        // I could use a boolean instead, but I don't wanna
        int flag = 0;

        // Prompt user for their input and store as an int
        System.out.println("Please enter the number of the month:");
        Scanner monthNum = new Scanner(System.in);
        int monthN = monthNum.nextInt();

        // Switch statement, with each case corresponding
        // to the appropriate month
        switch (monthN) {
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
                break;
            default:
                // Default case is error message, if the user enters a value outside of
                // 1 - 12, the flag gets set to 1, so that the error message gets printed
                flag = 1;
        }

        // Check that flag is either 0 or 1 using a ternary operator
        final String msg = flag == 0
                ? "The name of the month is " + month + "."
                : "Sorry, you've entered an invalid input.\n" +
                "Please restart the program.";

        // Print out the message
        System.out.println(msg);
    }
}

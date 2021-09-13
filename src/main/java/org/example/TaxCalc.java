package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Kisida
 */

import java.util.Scanner;
public class TaxCalc
{
    public static void main( String[] args )
    {
        final double taxPercent = .055;
        Scanner input = new Scanner(System.in);  // Create a Scanner object
        System.out.print("What is the order amount? ");
        String orderAmountStr = input.nextLine();  // Read user input
        double orderAmount = Integer.parseInt(orderAmountStr);
        System.out.print("What is the state? ");
        String state = input.nextLine();  // Read user input
        if (state.equals("WI")) {
            double tax  = .55;
            orderAmount = orderAmount + (tax * orderAmount);
            String output2 = String.format("The subtotal is $%.2f.\nThe tax is $%.2f.", orderAmount, tax);
            System.out.println(output2);
        }
        String output1 = String.format("The total is $%.2f", orderAmount);
        System.out.println(output1);
        input.close();
    }
}

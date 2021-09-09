package com.company;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Sean McCormack
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        System.out.print("How large is the room in square feet? ");
        int square_feet = Integer.parseInt(scan.nextLine());
        int square_print = square_feet;
        int gallons = 0;
        while (square_feet > 0){
            gallons++;
            square_feet=square_feet-350;
        }
        System.out.println("You will need to purchase "+ gallons+ " gallons of paint to cover "+square_print+" square feet.");
    }
}

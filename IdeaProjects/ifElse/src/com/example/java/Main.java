package com.example.java;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);     //to get input from user
	    System.out.println("Ener the tempeture");    //ask the user for input
	    Double temp = scanner.nextDouble();                //Store input into a variable

        if(temp < 97.5){                            //Test the variable for low
            System.out.println("The temperature " + temp + " is low");
        } else if (temp > 97.5 && temp < 99.5) {    //Test the variable for normal
            System.out.println("The temperature" + temp + " is normal");
        } else {                                    //Test the variable for high
            System.out.println("The temperature " + temp + " is high");
        }
    }
}

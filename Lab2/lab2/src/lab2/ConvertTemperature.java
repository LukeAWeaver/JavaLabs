/* -----------------------------------------------------------------------------
 *
 * File Name:  ConvertTemperature.java
 * Author: Your name 
 * Assignment:   EECS-168/169 Lab 2
 * Description:  This program will convert the input temperature from Fahrenheit to Celsius.
 * Date: date the program was last modified
 *
 ---------------------------------------------------------------------------- */
//Start your program.

package lab2;
import java.util.*;
public class ConvertTemperature {
	public static void main (String [] args){
		System.out.println("Enter the temperature in Fahrenheit:");
		Scanner input = new Scanner(System.in);
		// defining variables
		double fahr = input.nextDouble();
		double temp = (fahr - 32) * 5/9;
		// program
		System.out.println(fahr + " Degrees Fahrenheit = " + temp + " degrees Celcius");
	
	
	
	
	}
}

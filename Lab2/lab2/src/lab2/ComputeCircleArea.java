
/* -----------------------------------------------------------------------------
 *
 * File Name:  ComputeCircleArea.java
 * Author: Your name and Email address
 * Assignment:   EECS-168/169 Lab 2
 * Description:  This program will compute the area of the circle, where the radius is received
 *                      from the user.
 * Date: date the program was last modified
 *
 ---------------------------------------------------------------------------- */


package lab2;
import java.util.Scanner;

public class ComputeCircleArea
{
       public static void main(String[] args)
      {
           System.out.println("Enter the number for the radius:");
              //Declare the variables and constants.
Scanner variable = new Scanner (System.in);
double radius = variable.nextDouble();
double area = Math.PI * radius * radius;
              //Read the input from the keyboard.
              //Display the output
System.out.println("The area for the circle with a raidus of: " + radius + " is: "+ area);
       }
}
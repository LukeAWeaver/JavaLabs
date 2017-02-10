package lab09;

import java.util.*;

public class MyCircle {

	// Define the constant PI.
	private final static double PI = 3.141592;

	// The MyCircle class has one property: radius
	// Put a radius in your class
	public static double radius;

	// The MyCircle class has methods too.

	// Make a method that calculates the diameter of a circle. Recall the radius
	// is half of the diameter.
	// This method will take no parameters and return a double.
	// Why no parameters? Because the circle class has a radius built in. All
	// methods in the Circle class have access to it without it being passed
	// as a parameter! Sweet!
	public static double diameter() {
		return (radius * 2);
	}

	// Make a method that returns the area of a Circle.
	// This method takes no parameters. It returns a double.
	// Recall the area of a circle is PI * radius * radius
	// Since our circle has PI and radius as properties, we can use those in our
	// function without passing them in as parameters. Tubular!

	public static double area() {
		return (PI * radius * radius);
	}

	// Make a method that returns the circumference of a Circle.
	// This method takes no parameters. It returns a double.
	// Recall the circumference of a circle is 2 * PI * radius
	// Since our circle has PI and radius as properties, we can use those in our
	// function without passing them in as parameters. Radical!

	public static double circumference() {
		return (2 * PI * radius);
	}

}
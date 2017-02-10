import java.util.*;

public class SummationofFives {

	public static void main(String[] args) {
		System.out.printf("Please input a positive integer as the end value: ");
		Scanner sum = new Scanner(System.in);
		//define variables
		int i = 0;
		int newsum = 0;
		int input = sum.nextInt();
		//begin loop
		while (i < input) {
			newsum = newsum + i;
			i= i+5;
		}
		//exit while loop
		System.out.println("The summation is: " + newsum);
	}

}

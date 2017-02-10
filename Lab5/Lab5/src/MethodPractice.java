import java.util.*;

public class MethodPractice {

	public static int max(int a, int b) {
		if (a >= b) {
			return a;
		} else {
			return b;
		}
	}

	public static double sphereArea(double radius) {
		if (radius > 0) {
			double area = (4 * 3.14159 * radius * radius);
			return area;
		} else {
			return 0.00;
		}
	}

	public static void printWord(String word, int timesToPrint) {
		for (int i = 0; i < timesToPrint; i++) {
			System.out.println(word);
		}
	}

	public static void main(String[] args) {
		//<> portion begin
		System.out.println("Input two numbers:");
		Scanner input1 = new Scanner(System.in);
		int number1 = input1.nextInt();
		int number2 = input1.nextInt();
		System.out.println("The max of " + number1 + " and " + number2
				+ " is: " + max(number1, number2));
		//radius of sphere begin
		System.out.print("Input a radius: ");
		double number3 = input1.nextDouble();
		sphereArea(number3);
		System.out.println(sphereArea(number3));
		//wordxcount begin
		System.out.println("Input a string:");
		String word1 = input1.next();
		System.out.print("How many times do you want to print it?: ");
		int number4 = input1.nextInt();
		printWord(word1,number4);
	}
}

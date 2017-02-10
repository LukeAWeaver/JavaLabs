import java.util.*;

public class Triangle {

	public static void main(String[] args) {
		System.out
				.print("Enter the number of asterisks for the base of the triangle: ");
		Scanner scanner1 = new Scanner(System.in);
		// define variables
		int i = 0;
		int j = 0;
		// controls rows
		for (int userinput = scanner1.nextInt(); i <= userinput; i++) {
			//System.out.println("*");
			// controls columns
			for (j = 0; j < i; j++) {
				System.out.print("*");
			}
			//exits both for loops
			System.out.print("\n");
		}
	}
}

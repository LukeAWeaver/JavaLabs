package lab8;

import java.util.*;

public class Lab08 {

	public static void main(String[] args) {
		int a, b, c, i, k, j, rows, columns;
		int[][] value;
		System.out.print("How many rows?: ");
		Scanner sc = new Scanner(System.in);
		rows = sc.nextInt();
		System.out.print("How many columns?: ");
		columns = sc.nextInt();
		value = new int[rows][columns];
		for (j = 0; j < rows; j++) {
			for (i = 0; i < columns; i++) {
				System.out.println("Enter a value for position (" + j + "," + i
						+ "): ");
				value[j][i] = sc.nextInt();
			}
		}
		ArrayHelper help = new ArrayHelper();
		help.print2Darray(value);
		for (i = 0; i < value.length; i++) {
			System.out.print("Row "+i+ " Sum = " + help.arraySum(value[i]));
			System.out.println(", avg = "+ help.arrayAvg(value[i]));
			System.out.println();
		}
		System.out.println("The largest value in the array is = "+ help.arrayMax2D(value));
		System.out.println("The sum for the entire array is = "+ help.arraySum2D(value));
		System.out.println("The average for the entire array is = "+ help.arrayAvg2D(value));
	}
}

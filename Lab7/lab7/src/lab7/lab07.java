package lab7;

import java.util.*;

public class lab07 {

	public static void printArray(double[] arr) {
		int j = 0;
		System.out.println("Here are all the numbers in your array:");
		System.out.print("[");
		int size = arr.length;
		for (int i = 1; i < size; i++) {
			System.out.print(arr[i - 1] + ", ");
			j = i;
		}
		System.out.println(arr[j] + "]");
	}

	public static double[] arrayResize(double[] oldArray, int newSize) {
		double[] a_new=new double[newSize];
		Scanner sc = new Scanner(System.in); 
		int i;
		for (i=0;i<oldArray.length;i++)
		{
			a_new[i]=oldArray[i];
		}
		
		for (i=oldArray.length;i<newSize;i++)
		{
			System.out.print("Input a number into your array: ");
			a_new[i]=sc.nextDouble();
		}
		return a_new;
	}

	public static void main(String args[]) {
		int i = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input an array size:");
		int size = scanner.nextInt();
		// Original size
		double[] number = new double[size];
		for (i = 0; i < size; i++) {
			System.out.println("Input a number into your array:");
			number[i] = scanner.nextDouble();
		}
		printArray(number);
		System.out.println("Input a new size: ");
		int newsize;
		do {
			System.out
					.print("You must type a value greater than the previous array size:");
			newsize = scanner.nextInt();
		} while (newsize <= size);
		
		double[] a=arrayResize(number, newsize);
		printArray(a);
	}
}

import java.util.*;
import java.io.*;

public class Letter_Counter {

	public static void main(String[] args) {
		int k = 0;
		int[] array = new int[50];
		for (int i = 65; i < 115; i++) {
			array[k] = i;
			k++;
		}

		int h = 0;
		Scanner input1 = new Scanner(System.in);
		System.out.print("Input a file name: ");
		String t1 = input1.nextLine();
		FileReader myFileReader = null;
		BufferedReader myBufferedReader = null;
		try {
			myFileReader = new FileReader(t1);
			myBufferedReader = new BufferedReader(myFileReader);

			// read each line and modify accordingly
			String out = myBufferedReader.readLine();
			while (out != null) {
				// Do something with the line
				// Now, read in a new line

				// sth with the line;
				for (int i = 0; i < out.length(); i++) {
					char o = out.charAt(i);
					if (o == 'h') {
						h++;
					}
				}
				out = myBufferedReader.readLine();

			}
			myBufferedReader.close();
			for (k = 0; k < 50; k++) {
				System.out.println((char) (array[k]));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage()); // print what went wrong
		}
	}
}
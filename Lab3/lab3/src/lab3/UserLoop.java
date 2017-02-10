package lab3;
import java.util.*;
public class UserLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Input start value (included): ");
Scanner input = new Scanner(System.in);
int start = input.nextInt();
int i;
System.out.println("Input an ending value (excluded): ");
int end = input.nextInt();
		for(i=start; i < end; i++)
		{

			System.out.println(i);
		}
	
if (start >=end){
	System.out.println("Invalid input");
}
	}
}

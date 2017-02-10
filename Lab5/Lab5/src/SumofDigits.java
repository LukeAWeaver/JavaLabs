import java.util.*;
public class SumofDigits {
public static int addDigits(int x){
	/* d=position 0
	 * c=position 1
	 * b=position 2     ex. 0123
	 * a=position 3*/
	int a=x%10;
	int b=(x%100)/10;
	int c=(x%1000)/100;
	int d=(x%10000)/1000;
	//returning addition of numbers in position 0-3
	return a+b+c+d;
}
	public static void main(String[] args) {
		int number2=1;
		//loop
		do{
		
System.out.println("Please enter a No:");
Scanner number = new Scanner(System.in);
int number1 = number.nextInt();
System.out.println("The sum of the digits is: "+ addDigits(number1));
System.out.println();
System.out.println("Want to try again(y=1/n=0)");
number2 = number.nextInt();
	}
		while(number2==1);
		//end of loop
		System.out.println("Thank you!");
	}
}

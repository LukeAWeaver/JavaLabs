package lab3;
import java.util.*;
public class Multiples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("What number do you wish to see multiples of?");
Scanner Number = new Scanner(System.in);
		int numb = Number.nextInt();
		int num = numb;
		
		System.out.println("How many multiples?");
		Scanner Quantity = new Scanner(System.in);
		int quant = Quantity.nextInt();
		int quan = quant;
		
	if (quant > 0){
		System.out.println("Here are the first "+ quant + " multiples of the number " + numb + ":");
		for (num = num; num <= numb*quan; num = num + numb){
			System.out.println(num);
		}
		
	
	
	
	
	}
	else {
	System.out.println("The amount of multiples to display must be greater than zero");
}
	}

}

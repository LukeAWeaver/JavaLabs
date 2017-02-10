package lab2;
import java.util.*;
public class Hypotenuse {
public static void main (String [] args){

	//setting up value a
	System.out.print("Input a value for a: ");
	Scanner a = new Scanner(System.in);
double vala = a.nextDouble();

	//setting up value b
	System.out.print(" Input a value for b: ");
	double valb = a.nextDouble();
	//calling on the Math. class to find hyp
	double hyp = Math.sqrt(vala*vala + valb * valb);
	System.out.println("The hypotenuse is: " + hyp);
}
}

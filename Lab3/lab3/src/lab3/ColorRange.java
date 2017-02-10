package lab3;
import java.util.*;
public class ColorRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a wavelength in nm: ");
		Scanner Choice = new Scanner(System.in);
		int color = Choice.nextInt();
		if (color >= 620 && color <= 750){
			System.out.println("The color is Red.");
		}
		else if (color>=590 && color <=620){
			System.out.println("The color is Orange.");
		}
		else if (color>=570 && color <=590){
			System.out.println("The color is Yellow.");
		}
		else if (color>=495 && color<=570){
			System.out.println("The color is Green.");
	}
	else if (color>=450 && color <=495){
		System.out.println("The color is Blue.");
	}
	else if (color>380 && color <=450)
	{
		System.out.println("The color is Violet.");
	}
	else {
		System.out.println("Wavelength is not part of a visible spectrum..");
	}
}
}
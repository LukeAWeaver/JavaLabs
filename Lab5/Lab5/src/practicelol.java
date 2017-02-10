import java.util.*;
public class practicelol {

	public static void main(String[] args) {
System.out.println("Enter the size of the Square Matrix: ");
Scanner stuff = new Scanner(System.in);
int stuff1 = stuff.nextInt();
System.out.println("Square Matrix: ");
for (int y=3; y<stuff1*3; y=y*3){
	for(int x=y-2; x<=stuff1*stuff1; x++){
		System.out.print(x);
	}
	System.out.println();
}
	}

}

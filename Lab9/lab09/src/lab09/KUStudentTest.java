package lab09;

import java.util.*;

public class KUStudentTest {
	public static void main(String[] args) {
		System.out
				.println("Please input the student's name (firstname last name): ");
		Scanner input = new Scanner(System.in);
		KUStudent KU = new KUStudent();
		KU.set_name(input.next(), input.next());
		System.out.println("Please input the sutdent's KUID and department: ");
		KU.set_kuinfo(input.next(), input.next());
		System.out.println("Student: " + KU.get_fname() + " " + KU.get_lname());
		System.out.println("KUID: " + KU.get_id());
		System.out.println("Department: " + KU.get_dpt());
	}
}

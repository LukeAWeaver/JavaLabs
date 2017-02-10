package lab09;

import java.util.*;

public class KUStudent {
	static String stud_fname;
	static String stud_lname;
	static String stud_kuid;
	static String stud_dpt;

	public static void set_name(String f, String l) {
		stud_fname = f;
		stud_lname = l;
	}

	public static void set_kuinfo(String kuid, String dpt) {
		stud_kuid = kuid;
		stud_dpt = dpt;
	}

	public static String get_fname() {
		return stud_fname;
	}

	public static String get_lname() {
		return stud_lname;
	}

	public static String get_id() {
		return stud_kuid;
	}

	public static String get_dpt() {
		return stud_dpt;
	}
}

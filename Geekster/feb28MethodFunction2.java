package Geekster;

import java.util.*;

public class feb28MethodFunction2 {

	public static String getFullName(String first_name, String last_name) {
		String full_name = first_name + " " + last_name;
		return full_name;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first name");
		String first_name = sc.nextLine();
		
		System.out.println("Enter the second name");
		String last_name = sc.nextLine();
		
		String full_name = getFullName(first_name,last_name);

		 System.out.println(getFullName(first_name,last_name));

	}
}

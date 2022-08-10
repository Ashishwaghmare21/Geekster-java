package Geekster;

import java.util.Scanner;

public class feb23WAPmonthPassingYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int month = sc.nextInt();
		String monthString;
		switch (month) {
		case 1:
			monthString = "jan";
			break;
		case 2:
			monthString = "feb";
			break;
		case 3:
			monthString = "march";
			break;
		case 4:
			monthString = "april";
			break;
		case 5:
			monthString = "march";
			break;
		case 6:
			monthString = "may";
			break;
		case 7:
			monthString = "jun";
			break;
		case 8:
			monthString = "july";
			break;

		case 9:
			monthString = "aug";
			break;
		default:
			monthString = "Invalid day";
		}
		System.out.println(monthString);
	}

}

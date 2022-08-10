package Geekster;

import java.util.Scanner;

public class feb23QUE4 {

	public static void main(String[] args) {
		// WRITE A PROGRAM TO CHECK WHETHER GIVEN NUMBBER IS 10,20,30,40,50 OR NOT ANY OF THESE

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ::");
		int num = sc.nextInt();
		String numString;
		switch (num) {
		case 1:
			numString = "10";
			break;
		case 2:
			numString = "20";
			break;
		case 3:
			numString = "30";
			break;
		case 4:
			numString = "40";
			break;
		case 5:
			numString = "50";
			break;
			
		default:
			numString = "Invalid number";
		}
		System.out.println(numString);
	}

}

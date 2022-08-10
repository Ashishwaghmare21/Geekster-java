package Geekster;

import java.util.Scanner;

public class feb21IfaNumberby10AndSquareofSameNumberIsGreaterThan3 {

	public static void main(String[] args) {
		// If a Number by 10 and square of same number is greater than3

		int num = 100;
		boolean result = (num % 10 == 0) && (num * num > 3) ? true : false;
		System.out.println((num % 10 == 0) && (num * num > 3));
	}

}

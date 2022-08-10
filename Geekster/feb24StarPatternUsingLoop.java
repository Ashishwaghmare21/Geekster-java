package Geekster;

import java.util.Scanner;

public class feb24StarPatternUsingLoop {

	public static void main(String[] args) {
		// WAP PRINT THE PATTERN 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number if rows");
		int rows = sc.nextInt();
		System.out.println("print the pattern");

		for(int i = 1; i < rows; i++)
			
		    {
			
			for(int j = 1; j <= i; j++)
				
			{
				System.out.print("*");
			}
			    System.out.println();
		}
	}
}
              
   
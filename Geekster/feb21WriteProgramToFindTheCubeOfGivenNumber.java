package Geekster;
import java.util.*;
public class feb21WriteProgramToFindTheCubeOfGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
//		int number,cube;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the number");
//		number = sc.nextInt();
//		
//		cube = number*number*number;
//		System.out.println("\n cube of a given number" +number+ " = "+cube);
//		
		
		
		///for loop 
		
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        for (int i=1;i<=num;i++){
            System.out.println("Number is : "+i+" and cube of "+i+" is : "+(i*i*i));
	}

//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter the number");
//		int number = sc.nextInt();
//		
//		 
//		int cube = number*number*number;
//		System.out.println("cube of a given number" +number+" is"+cube);
}
}
package Geekster;
import java.util.*;
public class feb18Operator {

	public static void main(String[] args) {
		// Arthamatic operator
//		int x = 10;
//		int y = 25;
//		int z = 30;
//		int sum = x + y;
//		int diff = x - y;
//		int quotient = x / y;
//	    long exp2 = (x+y*z)/z;
//
//		System.out.println("sum of x+y ::" + sum);
//		System.out.println("diff of x-y::" + diff);
//		System.out.println("quotient of x/y::" + quotient);
//       System.out.println("expp result is "+ exp2);
//       
//       
//       //ternary operator
		//gretest two number using ternary operator
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the 1st neumber");
//		int a = sc.nextInt();
//		
//		System.out.println("Enter the 2nd number");
//		int b = sc.nextInt();
//		
//		System.out.println("Enter the 3rd number");
//		int c= sc.nextInt();
//		
//		
//		int result = (a>b)? ( a>c ? a:c) : (b>c ? b:c);
//		System.out.println("gretest of three number"+result);
//		
		
       //gretest two number using ternary operator if else
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1st number");
		int a = sc.nextInt();
		
		boolean isPositive = false;
		isPositive = (a>=0)? true : false;
		 
		if(isPositive) {
			System.out.println("positive");
		}
		else {
			System.out.println("Negative");
		}
     
       
	}

}

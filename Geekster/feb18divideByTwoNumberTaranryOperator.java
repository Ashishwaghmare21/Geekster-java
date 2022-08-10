package Geekster;
import java.util.*;
public class feb18divideByTwoNumberTaranryOperator {

	public static void main(String[] args) {
		// tarnari operator
		
//Example 1==> gretes two number
//		int a=10;
//		int b=20;
//		
//		int result =(a>b)? a : b;
//		System.out.println("gretes number is "+result);
		
//Example 2==>
		
//		Scanner sc= new Scanner(System.in);
//		System.out.println("enter the 1st number");
//		int a = sc.nextInt();
//		
//		System.out.println("Enter the 2nd number");
//		int b = sc.nextInt();
//		
//		int result = (a>b)? a:b;
//		System.out.println(result);
//		
//Example 3==> gretes of "three number
		 
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the 1st number");
//		int a = sc.nextInt();
//		
//		System.out.println("Enter the 2nd number");
//		int b = sc.nextInt();
//		
//		System.out.println("Enter the 3rd number");
//		int c = sc.nextInt();
//		
//		System.out.println("Enter the 4rd number");
//		int d = sc.nextInt();
//		
//		int result=(a>b) ? (a>c ? a:c) : (c>d ? c:d);
//		System.out.println("Gretest of number : " +result);
//		
		
		//Example=> Positive & negative number
		 
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the first number");
//		int a = sc.nextInt();
//
//		boolean isPositive = false;
//		isPositive = (a > 0) ? true : false;
//		
//		if (isPositive) {
//			System.out.println("Positive");	
//		} 
//		   else {
//			System.out.println("Negative");

//}
		
///////////////////   Example ==> marks reuslt/////////////
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter marks between 1 to 100");
//		int marks = sc.nextInt();
//		 
//		String result =""; 
//     	result =(marks>=90)? "pass" : ( (marks  >80 && marks <90 ) ? "very good" : "fail");
//     	System.out.println(result);
//			
//				
//   
		//Example ==? Bill amount
				
				Scanner sc= new Scanner(System.in);
				System.out.println("Enter billing amount ");
				double billing_amount =sc.nextDouble();
				
				double discountprice = (billing_amount>=10000) ? 0.9*billing_amount : 0.95*billing_amount;
				System.out.println(discountprice);
		       
		       
		       

	}
}


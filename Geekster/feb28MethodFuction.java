package Geekster;

import java.util.Scanner;

public class feb28MethodFuction {

	public static void main(String name) {
		//System.out.println("hi" +name);
	}
		public static void sum(int a, int b) {
		int sum=a+b;
		System.out.println(sum );

	}
		public static void sub(int a, int b) {
			int sub=a-b;
			System.out.println(sub );

		}
		public static void mul(int a, int b) {
			int mul=a*b;
			System.out.println(mul );

		}
		public static void div(int a, int b) {
			int div=a/b;
			System.out.println(div );

		}
		
		public static void main(String[]args) {
			Scanner sc= new Scanner(System.in);
					System.out.println("Enter choice : 1: sum, 2:sub, 3:mul, 4:div");
					int choice= sc.nextInt();
					
			
			if(choice >=1 && choice<=4) {
				System.out.println("Enter the first number");
				int num1=sc.nextInt();
				
				System.out.println("Enter the second number");
				int num2=sc.nextInt();
				
				switch(choice) {
				
				case 1:
					sum(num1,num2);
					break;
					
				case 2:
					sub(num1,num2);
					break;
					
				case 3:
					mul(num1,num2);
					break;
					
				case 4:
					div(num1,num2);
					break;
					
					
				}
				
			}
			else {
				System.out.println("Invalid choice");
			}
		}
		

}

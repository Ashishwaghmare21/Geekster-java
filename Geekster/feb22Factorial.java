package Geekster;

import java.util.Scanner;

public class feb22Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the number");
		 int num= sc.nextInt();
		 
		 int fact= 1;
		  
//		 for(int i=num;i>=1;i--) {
//			 fact=fact*i;
//			 
//		 }
//		 System.out.println("Factorial of"+num+ "is"+fact);
//	}
//
//}
////		 for(int i=1; i<=10; i++) {
////			 fact=fact*1;
////			 int result =num*i;
////			 System.out.println(num+ "*" +i+ "=>" +result);
////		 }
////			 
////}
//}
			int i = 1;
			while (i <= 10) {

				int result = num * i;
				System.out.println(num + "*" + i + "=>" + result);
				i++;
			}
		}
	}
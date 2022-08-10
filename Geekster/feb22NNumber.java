package Geekster;

import java.util.Scanner;

public class feb22NNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the number");
		 int num= sc.nextInt();
//		 
//		 int sum=0;
//		 for(int i=1; i<=num; i++) {
//			 sum= sum+i;
//			 
//		 }
//			 System.out.println(sum);
//		 
//	}
//}

//       
		 //USING WHILE LOOP 
			int i = 1;
			int sum=0;
			while (i <= num) {
				sum = sum + i;
				i++;
			}
			System.out.println(sum);
}
}

package Geekster;

public class feb14pro4maxmumNumber {
   public static void main(String[] args) {
		
		//find the max of 3 number
		
		int num1 = 100;
		int num2 = 20;	
		int num3 = 10;
		int max;
		
		if((num1 > num2)&& (num1 >num3)) 
		{
			
			System.out.println(num1);
		}
		
		else if((num2 > num1)&& (num2 >num3))
		{
			
			System.out.println(num2);
			
	     }

		else {
			System.out.println(num3);
		   }
}
}
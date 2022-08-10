package Geekster;

public class feb23PrimeNumber {

	public static void main(String[] args) {
		// find a prime number
//
//		int num=6;
//		if((num%2==0) || (num%3==0)||(num%5==0)||(num%7==0))
//		{
//			System.out.println("non Prime");
//		}
//		else {
//			System.out.println("Number is prime");
//		}
//	}
//
//}
		 //PRIME NUMBER 1 TO 50;
		for(int i=1;i<50;i++)
		
			if((i%2==0) || (i%3==0)|| (i%5==0)|| (i%7==0)) {
				System.out.println("non prime"+i);
				
			}
			else {
				System.out.println("prime"+i);
				
		}
	}
}

package Geekster;

public class feb24CheckNumberItsPrimeOrNot {

	public static void main(String[] args) {
		// CHECK THE NUMBER ITS PRIME OR not 
		int num=33;
		 boolean isprime= true;
		 for(int i=2; i<=num/2; i++) {
			 if(num%i==0) {
				 isprime=false;
				 break;
			 }
		 }
	
         if(isprime) {
        	 System.out.println("prime");
         }
         else {
        	 System.out.println("not prime");
         }
}
}
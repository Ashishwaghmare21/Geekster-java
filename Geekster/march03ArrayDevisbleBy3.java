package Geekster;

public class march03ArrayDevisbleBy3 {

	public static void main(String[] args) {
		// Check the how many variable inside that array are divisible by 3
		
		int b[]= {12,118,844,48,36,24};
		
		System.out.println(b.length);
		int val=0;
		
		for(int i=0;i<b.length;i++) {
			val= b[i];
			
			if(val%3==0) {
				System.out.println(val);
			}
		}

	}

}

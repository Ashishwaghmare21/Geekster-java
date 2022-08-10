package Geekster;

public class March03FindGcdandHcf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int gcd=findgcd(12,18);
	System.out.println("gcd:"+ gcd);
	}
		
		public static int findgcd(int a,int b)
		{
			int gcd=1;
			
			int len=(a<b?b:a);
			for(int i=2;i<=len;i++) {
				
				if(a%i==0 && b%i==0) 
				{
					gcd=i;
					
					}
			}
				return gcd;
	    }
	}



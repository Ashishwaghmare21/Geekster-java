package Geekster;

public class M01PerfectNnumberUsingMethodFuction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=6;
		System.out.println(CheckIfPerfectNumber(n));
	}
         public static boolean CheckIfPerfectNumber(int n) {
        	  boolean perfectNum= false;
        	  
        	  int sum =0;
        	  
        	  for(int i=1;i<=n;i++) 
        	  {
        		  if(n%i==0)
        		  {
        			  sum=sum+i;
        		  }
        	  }
        	  if(sum==n) {
        		   perfectNum=true;
        	  }
        	  return perfectNum;
          }
}

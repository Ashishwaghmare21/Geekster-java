package Geekster;

public class march01AmstrongNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	       System.out.println(ifArmStrong(15));
	}
        public static boolean ifArmStrong(int n)
        {
        	int orignalNum=n;
        	boolean armStrong= 	false;
        	int sum=0;
        	while(n!=0) 
        	{
        		int rem=n%10;
        		sum=sum+(rem*rem*rem);
//        	      sum = (int) (sum+ Math.pow(rem,67));
        		n = n/10;
        		
        	}
        	System.out.println("n vlaue "+n);
        	if(sum==orignalNum)
        	{
        		armStrong=true;
        	}
        	
        	return armStrong;
        }
}

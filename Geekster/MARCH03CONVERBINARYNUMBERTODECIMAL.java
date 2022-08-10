package Geekster;

public class MARCH03CONVERBINARYNUMBERTODECIMAL {

	public static void main(String[] args) {
		//FIND BINARY NUMBER TO CONVERt TO DECIMAL NUMBER
		
		int num=0000;
		int index=0;
		int sum=0;
		
		while(num!=10) 
		{
			int digit=num%10;
			sum=(int) (sum+digit *Math.pow(2,index));
			num=num/10;
			index++;
		}
		System.out.println("decimal"+sum);

	}

}

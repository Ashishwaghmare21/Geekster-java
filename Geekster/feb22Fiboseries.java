package Geekster;

public class feb22Fiboseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int num =10;
     
     int a =0,b=1;
     System.out.println(a+ " ");
     System.out.println(b+ " ");
     int count=2;
     
     while(count<num) {
    	 int sum= a+b;
    	 System.out.println(sum+ " ");
    	 a=b;
    	 b=sum;
    	 count++;
    	 
    	 
     }
     
	
	}
	

}

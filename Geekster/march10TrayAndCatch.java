package Geekster;
import java.util.*;
public class march10TrayAndCatch {

	public static void divide(int a, int b) {
		try{
			System.out.println(a/b);
			System.out.println("inside try block");
			}
		catch(Exception e) {
			System.out.println("Exception occured");
			
		}
	}
	public static void getValue(int []arr, int idx) {
		try {
			System.out.println(arr[idx]);
		}
		catch(Exception ex) {
			System.out.println("hiii");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a;
		int b;
		int []arr= {1,2,3,4,5};
		Scanner sc=new Scanner(System.in);
		
		a=sc.nextInt();
		b=sc.nextInt();
		
		divide(a,b);
		getValue(arr,5);
		System.out.println("hello world");
	}

}

package Geekster;
import java.util.*;
public class march02lengthArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             
		Scanner sc= new Scanner(System.in);
		 //array
		int mark[]= new int[4];
		int n=mark.length;
		 int count=1;
		 
		 //input
		 
		 for(int i=0;i<n;i++) {
			 mark[i]=count;
			 count++;
		 }
		 //output 
		for(int i=0;i<n;i++) {
			System.out.println(mark[i]);
		}
	}

}

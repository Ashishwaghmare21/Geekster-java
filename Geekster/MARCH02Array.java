package Geekster;
import java.util.*;
public class MARCH02Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		int mark[]=new int[5];
		
		for(int i=0;i<5;i++) {
		System.out.println("Entr the mark");
			 mark[i]= sc.nextInt();		
		}
		for(int i=0;i<5;i++) {
			System.out.println("Total number of mark :> "+mark[i]);
		}

	}

}

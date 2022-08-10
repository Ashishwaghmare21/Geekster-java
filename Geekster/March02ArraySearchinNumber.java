package Geekster;
import java.util.*;
public class March02ArraySearchinNumber {

	public static void main(String[] args) {
		// Take array of 10 thenn take user input find any no if present them found if this them not present

		  Scanner sc= new Scanner(System.in);
		  
		  int number[]= {22,11,33,44,55,88,44};
		   int  n=number.length;
		   
		  
		   System.out.println("Enter the number found:>");
		    int d=sc.nextInt();
		    int index=-1;
		    
		    
		    for(int i=0;i<n;i++) {
		    	
		    if(number[i]==d) {
		    	System.out.println("found"+(number[i]));
		    }else {
		    	System.out.println("Not found");
		    }
		    return;
		    }
		    
}
}
package Geekster;
import java.util.*;
public class March02ArrayNumberPostion {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		//array
		 int num[]= {10,22,18,13,45,85,46,18,22};
		 int n=num.length;
		 
		 System.out.println("Enter the value of serching:>");
		 int d =sc.nextInt();
		 boolean isFound =false;
		 int index=-1;
	      //int count=0;
		 
		  for(int i=0;i<n;i++) {
			  
			  if(num[i]==d) {
				  isFound=true;
				  index=i;
				  //count++;
				  break;  
			  }
		  }
		 if(isFound==true) {
			 System.out.println("Found at :>"+(index+1));
			// System.out.println("Found :>"+count+"<times");
		 }
		 else {
			 System.out.println("Not found");
		 }
	}
}

package March19MARCH21StringProblem;

public class Que7HowManyCharterString {

	public static void main(String[] args) {
		// Check the how many charter and world are their in the string ex, string s1="Welcome to this season"
       
		String s1="welcome to this season";
		
		System.out.println(s1.indexOf("to"));     //search word
		
		//String sArray[]=s1.split("");
//		for(int i=0;i<sArray.length;i++) {       //split karte
//			System.out.println(sArray[i]);
			
		String sArray[]= s1.split("");
		int count=sArray.length;
		System.out.println("no of world :"+count);      //count charter 
		}
	}

	
//}

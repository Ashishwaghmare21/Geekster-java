package Geekster;

public class march07Stringpalindrom {
	
	public static boolean ispalindrome(String s){
		int n= s.length();
		char[]str=s.toCharArray();
		int i=0;
		int j=n-1;
		
		while(i<j) {
			if(str[i]!=str[j]) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	
	
public static void main(String[] args) {
		
	String s = "nitin";
	boolean isPal=ispalindrome(s);
	System.out.println(isPal);
	}
}

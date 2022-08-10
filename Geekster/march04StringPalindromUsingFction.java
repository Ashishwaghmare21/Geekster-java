package Geekster;

public class march04StringPalindromUsingFction {
	
	
	public static boolean isPalindrome(String str) {
	
		int i=0;
		int j=str.length()-1;
		
		while(i<=j) {
			
			if(str.charAt(i) !=str.charAt(j)) {
			break;
			}
			else {
				i++;
				j--;
			}
		}
		if(i>=j) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		
		String str1= "nitin";
		boolean result=isPalindrome(str1);
		 System.out.println(result);
		
			
		
	}

}



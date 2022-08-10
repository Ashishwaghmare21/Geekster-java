package Geekster;

public class march04StringPalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1= "nitin";
		boolean isPalindorme=true;
		 
		int i=0;
		int j=str1.length()-1;
		
		while(i<=j) {
			
			if(str1.charAt(i) !=str1.charAt(j)) {
				isPalindorme=false;
				break;
			}
			else {
				i++;
				j--;
			}
			if(isPalindorme) {
				System.out.println("palindrome");
			}else {
				System.out.println("NOt palindrome");
			}
			//return ;
		}
	}

}

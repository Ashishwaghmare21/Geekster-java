package March19MARCH21StringProblem;

public class QueRemoveTheDuplicateCharInTheString {

	public static void main(String[] args) {
		//Remove the duplicate Char in the String
		String s1="hellollooheell";
		String s2="";
		
		for(int i=0;i<s1.length();i++) {
			
			if(!s2.contains(s1.charAt(i)+"")) {
				s2=s2+s1.charAt(i)+"";
				System.out.println(s2);
				
			}
		}

	}

}

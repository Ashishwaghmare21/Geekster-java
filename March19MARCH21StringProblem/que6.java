package March19MARCH21StringProblem;

public class que6 {

	public static void main(String[] args) {
		// check is the character is present in the string 	Ex-String s1="welcome"
		//method no :1
		String s1="Welcome";
		System.out.println(s1.indexOf("come")); 
		
		//method no :2
		
		boolean found =(s1.contains("come")==true?true:false);
		System.out.println("found :"+found);
		}
	}
	



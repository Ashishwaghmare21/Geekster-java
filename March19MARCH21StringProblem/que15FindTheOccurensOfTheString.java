package March19MARCH21StringProblem;

public class que15FindTheOccurensOfTheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String string = "welcome to my world You are always welcome to my world";
		String word = "welcome";
		String temp[] = string.split(" ");
		int count = 0;
		for (int i = 0; i < temp.length; i++) {
		if (word.equals(temp[i]))
		count++;
		}
		System.out.println("The string is: " + string);
		System.out.println("Time => " +count );
		}
	}



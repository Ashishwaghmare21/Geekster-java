package March19MARCH21StringProblem;

public class que14repace {

	public static void main(String[] args) {
		//Replace the last occurrence of the word hello to hi
		
		 String s="hello  world hope you are  doing good say my hello to your friend hello again";
		 
		 s=s.replaceAll("hello", "hi");
		 System.out.println(s);
		 s=s.replaceFirst("hi","hello");
		 System.out.println(s);
	}

}

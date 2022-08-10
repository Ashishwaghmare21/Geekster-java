package March19MARCH21StringProblem;

public class ReverseWorldSentence {
	public static void main(String[]args) {
		
		String s1="Welcome to programe to concepts ";
		String s2="Welcome";
		
		String a[]=s1.split(" ");
		for(int i=0;i<a.length;i++) {
			
			String word=a[i];
			if(word.equals(s2)) 
			{
				String newWord="";
				for(int j=word.length()-1;j>=0;j--) {
					newWord=newWord+word.charAt(j)+"";
				}
				System.out.println(newWord);
				s1=s1.replaceFirst(word, newWord);
			}
		}
		System.out.println(s1);
	}

}

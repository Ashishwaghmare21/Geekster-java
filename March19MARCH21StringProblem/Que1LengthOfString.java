package March19MARCH21StringProblem;

public class Que1LengthOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           String s1= "hello";
           System.out.println(s1.length());
           
           System.out.println(s1.charAt(0));
           
            char[]charray=s1.toCharArray();
            int x=charray.length;
            for(int i=1;i<=x-1;i++) {
            	System.out.println(charray[i]);
            }
	}

}

package Geekster;

public class march07StringCountLengthofString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str="hi we you studying in java";
        char[]arr=str.toCharArray();
        int n=str.length();
        
        int count=0;
        if(n>0) {
        	count=1;
        }
         for(int i=0;i<n;i++) {
        	 if(arr[i]==' ') {
        	 count++;
        	 
         }
	}
          System.out.println(count);
}
}
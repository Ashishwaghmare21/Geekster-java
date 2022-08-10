package Geekster;

public class march07PrintPrviousValueAndCurrentValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="aabbeeecdsssdff";
		char arr[]=str.toCharArray();
		int n= str.length();
		
		char[]result = new char[n];
		 
		int pre=0;
		int curr=1;
		result[0]= arr[0];
		int k=1;
		
		for(int i=1; i<n; i++) {
			
			if(arr[curr]==arr[pre]) {
				pre++;
				curr++;
				
			}
			else {
				result[k]=arr[curr];
				curr++;
				pre++;
				k++;
			}
		}
		 String retval= String.valueOf(result);
		 System.out.println(retval);
		
	
	}

}

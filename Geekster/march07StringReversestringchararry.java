package Geekster;

public class march07StringReversestringchararry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String str="hello world";
      char[]arr=str.toCharArray();
      int n= str.length();
      int j=n-1;
      for(int i=0;i<j;i++) {
    	  char temp=arr[i];
    	  arr[i]=arr[j];
    	  arr[j]=temp;
    	  j--;
      }
      for(int i=0;i<n;i++) {
    	  System.out.println(arr[i]+" ");
    	  
      }
		
	}

}

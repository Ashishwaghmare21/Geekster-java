package Geekster;

public class march07ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str="HeLlo WoRld";
		char arr[]=str.toCharArray();
		int n= str.length();
		
		for(int i=0;i<n;i++) {
			if(arr[i]>=65 && arr[i]<90) {          //uppercase
				arr[i]=(char)(arr[i]-'A'+'a');
			}
			else if(arr[i]>97&& arr[i]<=122){        //lowercase
				arr[i]=(char)(arr[i]-'a'+'A');
				
			}
		}
		String result= String.valueOf(arr);
		System.out.println(result);
	}

}

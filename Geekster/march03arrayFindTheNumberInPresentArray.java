package Geekster;

public class march03arrayFindTheNumberInPresentArray {

	public static void main(String[] args) {
		//FIND THE NUMBER IN PRESENT ARRAY
		
			int a[]= {12,23,45,69,89};
			
			int val=69;
			
			for(int i=0;i<a.length;i++) {
			
			if(a[i]==val) {
				
				System.out.println("present at index"+i);
				break;
			}
			else {
				System.out.println("not present");
				break;
			}
			}
		  

	}

}

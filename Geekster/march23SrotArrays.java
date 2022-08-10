package Geekster;

public class march23SrotArrays {
	public static int binarySearch(int arr[], int x) {

		int first = 0, last = arr.length - 1;
		while (first <= last)
		{
			int m = (first + last) / 2;
			
			if (arr[m] == x)
				return m;
			
			if (arr[m] < x)
				first = m + 1;
			
			else
				last = m - 1;
		}
		return -1;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[]= {1,2,3,4,5,6,7,8,9};
		 
		 int result=binarySearch(arr,1);
		 
		 if(result==-1) {
			 System.out.println("NOT Found");
		 }
		 else {
			 System.out.println(" Found ");
		 }
	}

}

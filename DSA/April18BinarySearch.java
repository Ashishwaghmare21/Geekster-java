package DSA;

public class April18BinarySearch {
	
	static int bs(int arr[],int target) {
		int start =0, end=arr.length-1;
		
		while(start<=end) 
		{
			//int mid=(start -end)/2 //prone to overflow    
			
			//int mid=(start+end)/2;
			int mid= start+(end-start)/2;
			
			if(arr[mid]==target) {
				return mid;
				
			}
			else if(arr[mid]<target ) {
				start=mid+1;
				}
			else
				end=mid-1;
		}
		//-1 indicated that target is missing form the array
		return-1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,4,5,6,9,11,12,13};
		int target=13;
		System.out.println(bs(arr,target));
		
	}

}

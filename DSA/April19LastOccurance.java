package DSA;
import java.lang.*;
public class April19LastOccurance {
	static int upperBoand(int arr[], int target) {
		int start=0, end =arr.length-1, res=-1;
		
		 while(start<=end) {
			 
			 int mid= start +(end -start)/2;
			 
			 if(arr[mid]==target)
			 {
				 res=mid;
				 start =mid+1;
				 
			 }
			 else if(target>arr[mid]) {
				 start=mid+1;
			 }
			 else  {
				 end=end-1;
			 }
			 
				 
		 }
		 return res;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,2,2,3,3,3,4,5,6,6,6,7,7,7,};
		int target=2;
		System.out.println(upperBoand(arr,target));

	}

}

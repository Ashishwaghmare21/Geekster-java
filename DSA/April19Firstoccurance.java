package DSA;
import java.lang.*;
public class April19Firstoccurance {
	static int firstoccarance(int arr[],int target) {
		
		int start=0,end=arr.length -1,res=-1;
		
		while(start<=end) {
			int mid= start+(start-end)/2;
			
			if(arr[mid]==target) {
				res=mid;
				end=mid-1;
			}
			else if(target>arr[mid]) {
				start=mid+1;
			}
			else 
				end=mid-1;
		
			
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,1,2,2,2,2,3,4,4,5,5,6,6,7,7,7};
		int target=1;
		System.out.println(firstoccarance(arr,target));
	}

}

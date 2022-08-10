package DSA;
import java.util.Arrays;
public class April19CheckDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {2,3,4,5,1,7,};
		
		boolean flag=false;
		
		for(int i=0;i<arr.length;i++)
		{
			int target=arr[i]*2;
			  
			
			int idx= Arrays.binarySearch(arr,i+1,arr.length,target);
			
			if(idx >-1)
			{
				System.out.println("True");
				flag=true;
				break;
				
			}
			if(flag==false) {
				System.out.println("False");
				break;
			}
		}
	}

}

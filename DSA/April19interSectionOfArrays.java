package DSA;

import java.util.Arrays;

public class April19interSectionOfArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = { 1, 2, 3, 5, -1 };
		int arr2[] = { 10, 3, -1, 11, 12 };

		Arrays.sort(arr2);

		for (int i = 0; i < arr1.length; i++) 
		{
			int target = arr1[i];
			
			int idx = Arrays.binarySearch(arr2, target);
			
			if (idx > -1)
				
				System.out.println(target); // Common element in both arrays
		}
	}

}

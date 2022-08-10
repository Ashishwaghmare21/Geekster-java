package Geekster;

public class march23rearrangeArrays {
	public static void rearrArray(int arr[]) {
		
		int n = arr.length - 1;
		int j = 0, temp;

		for (int i = 0; i < n; i++)
		{
			if (arr[i] < 0) 
			{
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;

			}
		}
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, -5, -8, 9, -7, 4, -11, 12, -18 };
		rearrArray(arr);

	}

}

package Geekster;

public class march09findTheMaximumElementEachMatrix {

	public static void main(String[] args) {
		// Find the maximum element of each row in matrix

		int a[][] = { { 10, 5, 2 }, { 4, 58, 8 }, { 7, 8, 65 } };
		int max = 0;
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = 0; j < a.length; j++){
				
				if (a[i][j] > max) 
				{
					max = a[i][j];
				}
			}
			System.out.println("max element in row is:" + i + "is" + max);
		}
	}

}

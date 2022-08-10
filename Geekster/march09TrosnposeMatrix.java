package Geekster;

public class march09TrosnposeMatrix {

	public static void main(String[] args) {
		// Transpose of matrix
		
		int a[][]= {{4,5},{7,8}};
		int b[][]=new int[a.length][a.length];
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=0;j<a.length;j++) {
				b[i][j]=a[j][i];
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	}

}

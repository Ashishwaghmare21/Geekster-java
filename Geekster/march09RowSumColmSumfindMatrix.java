package Geekster;

public class march09RowSumColmSumfindMatrix {

	public static void main(String[] args) {
		// find the row sum and colam sum
		
		int a[][]= {{1,5},{15,8}};
		
		
		for(int i=0;i<a.length;i++) {
			
			int sum=0;
			int columsum=0;
			
			for(int j=0;j<a.length;j++) {
				sum=sum+a[i][j];
				columsum=columsum+a[j][i];
			}
			System.out.println("sum of two matrix is"+i+"="+sum);
			System.out.println("sum of two marix is columSum is"+i+"="+columsum);
		}

	}

}

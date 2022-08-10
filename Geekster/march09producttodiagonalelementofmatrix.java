package Geekster;

public class march09producttodiagonalelementofmatrix {

	public static void main(String[] args) {
		// product to diagonal element of matrix
		int a[][]= {{1,2,3},{2,3,4},{4,5,6}};

		int product=0;
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(i==j) {
					product=product*a[i][j];
				}
			}
		}
		System.out.println("prodct of diagonal element is :"+product);
	}

}

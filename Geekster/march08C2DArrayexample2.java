package Geekster;
import java.util.*;
public class march08C2DArrayexample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int[][]arr= {{1,2,3,4},{4,5,6,7},{9,10,11,12},{20,21,22,23}};
		
		int r=arr.length;
		int c=arr.length;
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}

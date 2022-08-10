package Geekster;

import java.util.Scanner;

public class march082DarraysumallElement {
			
	public static int sumElement(int arr[][],int r, int c) {
		int sum=0;
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				sum=sum+arr[i][j];    //he sum add kel
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);

		int[][]arr= {{1,2,3,4},{4,5,6,7},{9,10,11,12},{20,21,22,23}};
		
		int r=arr.length;
		int c=arr.length;
		
		int sum=sumElement(arr,r,c);    //ithe call kel
		System.out.println("sum of all elment in arrya is"+sum);
	}

}

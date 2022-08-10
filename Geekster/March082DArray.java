package Geekster;

import java.util.Scanner;

public class March082DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc= new Scanner(System.in);
	int [][]arr= new int[3][3];
	int val=0;
	
	//input
	
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			System.out.println("enter the value");
			val=sc.nextInt();
			
			arr[i][j]=val;
		}
	}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}

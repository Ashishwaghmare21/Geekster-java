package Geekster;

import java.util.Scanner;

public class feb24 {

	public static void main(String[] args) {
		//WAP NOT DIVISIBLE BY 10 NUMBER
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		for(int i=0; i<=n; i++)
		{
			for (int j=0;j<=i;j++)
			{
				if((i+j)%10==0)
				{
					continue;
				}
				System.out.println(i+j);
			}
		}
		
		

	}

}

package Geekster;

public class march03FindSumDifferntSize {

	public static void main(String[] args) {
		//
		
		int a[]= {2,4,6,100,90};
		int b[]= {7,67,9};
		
		int largerArraySize= a.length>b.length?a.length:b.length;
		int smallArraySize=a.length<b.length?a.length:b.length;
	
		int c[]=new int[(largerArraySize)];
		
		for(int i=0;i<smallArraySize;i++) {
			c[i]=a[i]+b[i];
			System.out.println(c[i]);
		}
		
		for(int k=(smallArraySize);k<largerArraySize;k++) {
			c[k]=a[k];
		}
		for(int m=0;m<c.length;m++)
		{
			System.out.println(c[m]);
		}
	}

	}



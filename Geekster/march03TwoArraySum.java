package Geekster;

public class march03TwoArraySum {

	public static void main(String[] args) {
		// Find sum of two array
		
		int a[]= {10,20,30};
		int b[]= {20,30,50};
		
		int c[]= new int [b.length];
		
		for(int i=0;i<a.length;i++) {
			
			c[i]=a[i]+b[i];
		}
	    for(int j=0; j<c.length;j++) {
	    	System.out.println(c[j]);
	    }
	}

}

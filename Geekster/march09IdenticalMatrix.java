package Geekster;

public class march09IdenticalMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,0,0},{0,1,0},{0,0,1}};
		
		boolean identity= true;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				
				//digoanl element
			if(i==j) {
				if(!(a[i][j]==1)) {
					identity=false;
					break;
				}
			}
			//non digonal element 
			
			else {
				if(!(a[i][j]==0)) {
					identity=false;
					break;
			  }
			}
		}
	}
		System.out.println("is identity matrix is:"+identity);

	}
}

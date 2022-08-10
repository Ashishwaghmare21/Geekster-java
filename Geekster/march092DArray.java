package Geekster;

public class march092DArray {

	public static void main(String[] args) {
		// Check to given matrices is identical		
		
		int row[][]= {{2,4},{8,7}};
		int colm[][]= {{2,4},{8,7},{9,0}};
		
		System.out.println(row.length);
		
		boolean identical=true;
		
		if(row.length!=colm.length) {
			identical=false;
		}
		else {
			   for(int i=0;i<row.length;i++) {
				   for(int j=0;j<row.length;j++) {
					   if(!(row[i][j]==colm[i][j])) {
						   
						   identical = false;
						   break;
					   }
				   }
			   }
		}
		System.out.println("identical?"+identical);
	}

}

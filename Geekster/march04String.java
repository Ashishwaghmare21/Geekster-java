package Geekster;

public class march04String {

	public static void main(String[] args) {
		// Method no:1 contains method
		
//		String str1 = "ForGeekster";
//		String str2 = "ForG";
//		
//		if(str1.contains(str2)) {
//			System.out.println("found");
//		}else {
//			System.out.println("Not found");
//		}
		
		///Mthod NO:2>
		
		String str1 = "ForGeekster";
		String str2 = "ForG";
		boolean isFound = false;
		int count = 0;

		for (int i = 0; i < str1.length(); i++) {
				int k = i;
				count=0;
			
			for (int j = i; j < str2.length(); j++)
			{
				if (str1.charAt(k) != str2.charAt(j)) 
				{
					break;
				}
				else {
						count++;
						k++;
			}
		}
				if (count == str2.length()) {
						isFound = true;
						break;
			}
		}
		if (isFound) {
			System.out.println("found");
		} else {
			System.out.println("Not Found");
		}
	}
}

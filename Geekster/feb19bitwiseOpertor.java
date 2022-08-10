package Geekster;

public class feb19bitwiseOpertor {

	public static void main(String[] args) {
		// if  check two number betwise opreter
		
//		int a = 5;
//		int b = 5;
//		int z= a^b;
//		
//		if(z == 0) {
//			System.out.println("equal");
//		}
//		else {
//			System.out.println("not equal");
//				
//
//	}
		
//		Example ==> count and print no of digit in number
		
//		int num =112345;
//		int count=0;
//		while(num>0) {
//			count++;
//		num= num/10;
//		
//		}
//			System.out.println(count);
//		}
	//}
		int num =1;
		int count =0;
		while(num>0)
		{
			if ((num&1) ==1)
		
		{
			count ++;
		}
			num = num>>1;
		}
		System.out.println(count);
		
	}
}


		
		
		
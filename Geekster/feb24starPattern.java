package Geekster;

public class feb24starPattern {
	public static void main(String[] args) {
		// Star pattern

//		int n = 5;
//		int sp = n / 2;
//		int st = 1;
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= sp; j++) {
//
//				System.out.print(" ");
//			}
//			for (int j = 1; j <= st; j++) {
//				System.out.print("*");
//			}
//
//			if (i <= n / 2) // upper region
//			{
//				sp--;
//				st = st + 2;
//			} else {
//				sp++;
//				st = st - 2;
//			}
//			System.out.println();
//		}
//
//	}
//}
		//PROBLE==>2
		
		int n = 10;
		int sp = n / 2;
		int st = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sp; j++) {

				System.out.print("");
			}
			for (int j = 1; j <= st; j++) {
				System.out.print("*");
			}

			if (i <= n / 2) // upper region
			{
				sp--;
				st = st + 1;
			} else {
				sp++;
				st = st - 1;
			}
			System.out.println();
		}

	}
}

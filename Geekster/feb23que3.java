package Geekster;

public class feb23que3 {

	public static void main(String[] args) {
		//WRITE A PRIGRAM TO CHECK WHETHER GIVEN NUMBER IS LESSER OF GREATER THAN 10 IF ITS LESSER THAN CHECK FURTHER IF ITS LESSER OF GREATER THAN 5
		int num = 122;
		if (num >= 10 || num <= 10) {
			System.out.println("Number is greter than 10 and less than 10");

			if (num <= 10) {
				System.out.println("Number is less than 10");
			}
			if (num >5) {
				System.out.println("number is greater  than 5");
			} else {
				System.out.println("Number is less than 5");
			}
		}
	}

}

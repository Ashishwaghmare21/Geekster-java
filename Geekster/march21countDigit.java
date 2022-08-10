package Geekster;

public class march21countDigit {

	public static int countDigit(int num) {
		int d = 0;
		while (num > 0) {
			num = num / 10;
			d++;
		}
		return d;
	}

	public static void main(String args[]) {
		int num = 1234567;
		int k = 5;
		int d = countDigit(num);

		int divisor_factor = 1;
		for (int i = 0; i < k; i++) 
		{
			divisor_factor = divisor_factor * 10;
		}
		
		int multiplaying_factor = 1;
		for (int i = 0; i < (d - k); i++) 
		{
			multiplaying_factor = multiplaying_factor * 10;
		}
		
		int rem = num % divisor_factor;
		int q = num / divisor_factor;
		int reversedNumber = (rem * multiplaying_factor) + q;
		
		System.out.println(reversedNumber);
	}
}
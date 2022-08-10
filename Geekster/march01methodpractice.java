package Geekster;

public class march01methodpractice {
	public static void main(System[] args) {
		char ch = 'm';
		boolean vowel = checkVowel(ch);
		System.out.println("is vowel " + vowel);
	}

	static boolean checkVowel(char ch) {
		boolean vowel = false;
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			vowel = true;
		}
		return vowel;
	}
}

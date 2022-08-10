package Geekster;

import java.util.Scanner;

public class march03FindLcm {

	public static int lcmfind(int m, int n) {

		int lcm = 0;
		if (m > n) {
			lcm = m;

		} else {
			lcm = n;
		}

		for (lcm = 1; lcm > 0; lcm++) {
			if ((lcm % m == 0) && (lcm % n == 0)) {
				lcm = lcm;
			}
		}
		return lcm;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Find the lcm");
		int n = sc.nextInt();
		int m = sc.nextInt();

		int lcm = lcmfind(n, m);
		System.out.println("lcm of " + m + "," + n + "are" + lcm);

	}

}

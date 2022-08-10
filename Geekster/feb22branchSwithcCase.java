package Geekster;

public class feb22branchSwithcCase {
	public static void main(String[] args) {
		int year = 4;
		String branch = "CSE";
		switch (year) {
		case 1:
			System.out.println("All branch are comman");
		case 2:
		case 3:
		case 4:

			switch (branch) {
			case "IT":
			case "CSE":
				System.out.println("you have opteid for computer brach");
				break;

			case "EE":
			case "ENT":
				System.out.println("you have opteid for branch ");
				break;
			case "Machenical":
				System.out.println("you have opteid for mechanical branch");
				break;
			default:
				System.out.println("invalid branch");
				break;
			}

		}
	}
}

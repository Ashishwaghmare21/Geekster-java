package Geekster;

public class feb19CheckIfBetIsSetOrButFalse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 11;
		int k=1;
		num = num>>(k-1);
		if( (num&1)==1)
		{
			System.out.println("Bit is set ");
		}
		else {
			System.out.println("Bit is not set");
		}
	}

}

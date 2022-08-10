package Geekster;

public class feb16Dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 1;
		int count = 10;
		do
		{
			int num= 3* i +2;
			
			if(num%4 != 0)
			{
				System.out.println(num);
				count ++;
				
			}
			i++;
		}	while(count<5);
		
	}
		
}


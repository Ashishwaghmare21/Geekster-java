package Geekster;

public class feb16FormulaPraoblem 
{ static void main(String[] args) {
// First 5 term of 3n+2 and not multiples of 4
// range =1 to 5
//condition 1->compute the number
//condition 2-> not multiple of 4
	
	int count=0;
	for(int i = 1; count<5; i++)
	{
		 
		 
		int num =(3* i +2);
	 
		if(num%4!= 0)
		{ 
			System.out.println(num);
			count++;
		} 
	}
	}

}

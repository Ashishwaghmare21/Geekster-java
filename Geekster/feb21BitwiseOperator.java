package Geekster;

public class feb21BitwiseOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1= 2;          // binary num 0010
		int a2= 4;          //        mum 0100
		                    //        ans 0000 o/p=0
		System.out.println(a1&a2);  //AND

           a1 =3;  //0011
           a2 =5;  //0101
                   //0111 o/p=7
           System.out.println(a1|a2);  //OR
           
           a1 =3;     
           a2 =5;
           System.out.println(a1^a2); //XOR
	}

}
// op binary number 
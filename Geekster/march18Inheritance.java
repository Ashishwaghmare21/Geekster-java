package Geekster;

class Human{
	int legs;
	int hands;
	
	Human(int legs, int hands )
	{
		System.out.println("inside human constrter");
		this.legs=legs;
		this.hands=hands;
	}
	public void eat() {
		System.out.println("human eat");
	}	
	public static void walk() {
		System.out.println("human walk");
	}
}
class Baby extends Human{
	boolean isCrew;
	Baby(int legs,int hands,boolean isCrew)
	{
		super(legs,hands);//calling parent constructor
		System.out.println("Inside baby constructor");
		this.isCrew=isCrew;
	}
	public void eat() {
		System.out.println("babies eat");
	}
	public static void walk() {
		System.out.println("babies walk");
	}
	
	 
	
}
public class march18Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
	//	System.out.println(==========Human==========);
//		Human h=new Human(2,2);
//		h.eat();
//		
//	  //System.out.println(===========baby============);
//		Baby b= new Baby(2,2,true);
//		b.eat();
	
		Human h2= new Baby(2,2,true);
		h2.walk();
		
		
	}

}

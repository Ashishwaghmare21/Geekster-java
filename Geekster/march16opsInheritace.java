package Geekster;
class animal{
	int legs;
	String mouth;
	
	public void eat() {
		System.out.println(" i eat");
	}
	public void walk() {
		System.out.println(" i walk");
	}
}

class dog extends animal{
	public void brck() {
		System.out.println("i brack");
	}
}

class elephant extends animal{
	int trank;
}
public class march16opsInheritace {

	public static void main(String[] args) {
		
		animal a= new animal();
		a.legs=4;
		a.eat();
		a.walk();
		System.out.println(a.legs);
		dog d=new dog();
		
		d.brck();
	    d.eat();
	    d.walk();

	}

}

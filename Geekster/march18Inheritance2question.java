package Geekster;

class Derived {
	protected void getDetils(String temp) {
		System.out.println("Derived class" + temp);
	}
}

public class march18Inheritance2question extends Derived {

	protected void getDetils(String temp) {
		System.out.println("arch18Inheritance2question class :" + temp);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		march18Inheritance2question obj = new march18Inheritance2question();
		obj.getDetils("Gfg");
	}

}

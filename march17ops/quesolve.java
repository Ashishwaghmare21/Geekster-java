package march17ops;
///Que: Create abstract class vehical with one abstract method and create car and truck class which implement the vechile clas

abstract class Vehical {
	abstract void showQuality();
}

class Car extends Vehical {

	void showQuality() {
		System.out.println("in Car");
	}

}

class Trunk extends Vehical {
	void showQuality() {
		System.out.println("in Truck");
	}
}

public class quesolve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehical v = new Car();
		v.showQuality();

	}

}

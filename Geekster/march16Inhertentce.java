package Geekster;

class Animal {
	int legs;
	int mouth;
	int tail;

	Animal(int legs, int mouth, int tail) {
		System.out.println("inside the construster");
		this.legs = legs;
		this.mouth = mouth;
		this.tail = tail;
	}

	public void eat() {
		System.out.println("I eat");
	}

	public void walk() {
		System.out.println("I Walk");
	}
}

class Dog extends Animal {
	int paws;

	Dog(int paws, int legs, int mouth, int tail) 
	{
		super(legs, mouth, tail); // calling parent constructor
		
		System.out.println("inside the dog");
		
		this.paws = paws;
	}

	public void bark() {
		System.out.println("i bark");
	}
}

class puppy extends Dog{
	
	boolean isCute;
	
	puppy(boolean isCute, int paws, int legs,int mouth ,int tail)
	{
		super(paws,legs, mouth,tail);        //calling parent constructor
		System.out.println("Inside the puppy constructor");
		this.isCute=true;
	}
	

	public void bark() {
		System.out.println("puppy bark");
	}
}

public class march16Inhertentce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=======dog=======");
		Dog d = new Dog(4, 4, 1, 1);
		d.bark();
//		d.eat();
//		d.walk();
//		System.out.println(d.paws);
//		System.out.println(d.legs);
		
		System.out.println( "===========puppy====== ");
		
		puppy p= new puppy(true,4,4,1,1);
		p.bark();
//		p.eat();
//		p.walk();
//		System.out.println(p.paws);
//		System.out.println(p.legs);

	}

}

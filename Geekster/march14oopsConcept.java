package Geekster;
class Student{
	String name;
	int age;
	String course;


public void sayHello() {
	System.out.println("hello");
}

public String getName() {      //hello la return karte name ashish 
	return this.name;
	}
}
public class march14oopsConcept {
      
	public static void main(String[] args) {
		Student s1=new Student();
		s1.name="Ashish";
		s1.age= 25;
		s1.course="c";
		s1.sayHello();
		System.out.println(s1.getName());
		
     System.out.println(s1.name);
     System.out.println(s1.age);
     System.out.println(s1.course);
	}
}

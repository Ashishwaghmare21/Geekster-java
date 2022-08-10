package Geekster;
class Student{
	String name;
	int age;
	String course;
 
	Student(){
		this.age=20;
		this.course="computer";
		System.out.println("insider Constructor");
	}
	
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public String getCourse() {
		return this.course;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void setCourse(String course) {
		this.course=course;
	}
}

public class march14ThisfuctionGetFuctionOps {

	public static void main(String[] args) {
		Student s1= new Student();
		Student s2= new Student();
		 System.out.println("hi");
		 s1.setName("as");
		 s2.setName("sce");
         
		 System.out.println(s1);
		 System.out.println(s2);
		 
	}

}

package Geekster;
 class Student{
	 String name;
	 int age;
	 String course;
	 
	 Student(){
		 this.name="ashish";
		 this.age=20;
		 this.course="cse";
	 }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	 
 }
public class march14toStringMethod {

	public static void main(String[] args) {
         Student s1=new Student();
         Student s2=new Student();
         
         s1.setName("ashish");
		 s2.setName("waghmare");
         
		 System.out.println(s1);
		 System.out.println(s2);

}
}
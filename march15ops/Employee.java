package march15ops;

public class Employee {
String id;
String name;
float salary;
String desiganation;
String department;
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", desiganation=" + desiganation
			+ ", department=" + department + "]";
}

Employee(String id, String name,String desiganation,String department){
				
			this.id=id;
			this.name=name;
			this.desiganation=desiganation;
			this.department=department;
}
}

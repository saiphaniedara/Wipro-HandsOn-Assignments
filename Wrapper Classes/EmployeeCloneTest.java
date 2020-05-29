
public class EmployeeCloneTest {

	public static void main(String[] args) {
		Employee e1=new Employee("Phani",516,19,15000);
		Employee e2;
		e2=e1.clone();
		System.out.println("Employee 1 Details:\nName: "+e1.name+"\nId: "+e1.id+"\nAge: "+e1.age+"\nSalary: "+e1.sal+"\n");
		System.out.println("Employee 2 Details:\nName: "+e2.name+"\nId: "+e2.id+"\nAge: "+e2.age+"\nSalary: "+e2.sal+"\n");
		e1.name="Surya";
		e1.id=340;
		e1.age=23;
		e1.sal=35000;
		System.out.println("Employee 1 Details:\nName: "+e1.name+"\nId: "+e1.id+"\nAge: "+e1.age+"\nSalary: "+e1.sal+"\n");
		System.out.println("Employee 2 Details:\nName: "+e2.name+"\nId: "+e2.id+"\nAge: "+e2.age+"\nSalary: "+e2.sal+"\n");
	}

}

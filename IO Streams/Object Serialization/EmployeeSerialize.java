import java.util.Date;
import java.io.*;
public class EmployeeSerialize {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("Employeeobjects.txt"));
		Employee e1=new Employee("Phani",new Date("11/8/2000"),"IT",50000);
		oos.writeObject(e1);
		System.out.println("Employee Object is serialized");
		oos.close();
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("Employeeobjects.txt"));
		Employee e2=(Employee)ois.readObject();
		System.out.println("Employee object is deserialized");
		ois.close();
		System.out.println("Employee Details are:\n");
		System.out.println("Name: "+e2.getName());
		System.out.println("Date Of Birth(YYYY-MM-DD): "+e2.getDateOfBirth());
		System.out.println("Department: "+e2.getDepartment());
		System.out.println("Salary: "+e2.getSalary());
	}

}

package list_assignments;
import java.util.Vector;
import java.util.Iterator;
public class Assignment7 {
	public static void main(String[] args)
	{
		Vector<Employee> emps=new Vector<Employee>();
		Employee e1=new Employee(186,"Stefan","stefanss@gmail.com","male",56000);
		Employee e2=new Employee(184,"Damon","damonss@gmail.com","male",258000);
		emps.add(e1);
		emps.add(e2);
		Iterator<Employee> iter=emps.iterator();
		while(iter.hasNext())
		{
			Employee e=iter.next();
			System.out.println("Emp Id: "+e.empId);
			System.out.println("Emp Name: "+e.empName);
			System.out.println("Emp Email: "+e.email);
			System.out.println("Emp Gender: "+e.gender);
			System.out.println("Emp Salary: "+e.salary+"\n");
		}
	}
}

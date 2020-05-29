package list_assignments;
import java.util.ArrayList;
import java.util.Iterator;
public class EmployeeDB {
ArrayList<Employee> list;
public EmployeeDB()
{
	list=new ArrayList<Employee>();
}
public boolean addEmployee(Employee e)
{
	return list.add(e);
}
public boolean deleteEmployee(int empId)
{
	Iterator iter=list.iterator();
	boolean removed=false;
	while(iter.hasNext())
	{
		Employee emp=(Employee) iter.next();
		if(emp.empId==empId)
		{
			iter.remove();
			removed=true;
		}
	}
	return removed;
}
public String showPaySlip(int empId)
{
	Iterator iter=list.iterator();
	while(iter.hasNext())
	{
		Employee emp=(Employee)iter.next();
		if(emp.empId==empId)
		{
			return "The salary of the employee is: "+emp.salary;
		}
	}
	return "Employee not found";
}
}

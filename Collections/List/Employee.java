package list_assignments;

public class Employee {
int empId;
String empName;
String email;
String gender;
float salary;
public Employee(int empId,String empName,String email,String gender,float salary)
{
	this.empId=empId;
	this.empName=empName;
	this.email=email;
	this.gender=gender;
	this.salary=salary;
}
public void getEmployeeDetails()
{
	System.out.println("Employee Details are:\n");
	System.out.println("Name: "+empName);
	System.out.println("Id: "+empId);
	System.out.println("Email: "+email);
	System.out.println("Gender: "+gender);
	System.out.println("Salary: "+salary);
}
}

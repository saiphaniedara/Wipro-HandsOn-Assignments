package inheritance;

class Employee extends Person{
double annualSalary;
String yearOfJoining;
String insuranceNumber;
public Employee(String name,double aSal,String yoj,String insNo)
{
	super(name);
	annualSalary=aSal;
	yearOfJoining=yoj;
	insuranceNumber=insNo;
}
public void getEmployeeDetails()
{
	 System.out.println("Employee Name: "+name);
	 System.out.println("Employee Annual Salary: "+annualSalary);
	 System.out.println("Employee's Year of Joining: "+yearOfJoining );
	 System.out.println("Employee's National Insurance Number: "+insuranceNumber);
}
}

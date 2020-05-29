package list_assignments;

public class Assignment2 {
public static void main(String[] args)
{
	Employee e1=new Employee(101,"Phani","eedarasaiphani2000@gmail.com","male",50000);
	Employee e2=new Employee(102,"Surya","HIVsurya@gmail.com","gay",1500);
	EmployeeDB db=new EmployeeDB();
	if(db.addEmployee(e1)==true)
	{
		System.out.println("Employee Phani added successfully..");
	}
	else
	{
		System.out.println("Employee Phani not added..");
	}
	if(db.addEmployee(e2)==true)
	{
		System.out.println("Employee Surya added successfully..");
	}
	else
	{
		System.out.println("Employee Suryanot added..");
	}
	System.out.println(db.showPaySlip(101));
	System.out.println(db.showPaySlip(102));
	System.out.println(db.showPaySlip(103));
	if(db.deleteEmployee(102)==true)
	{
		System.out.println("Employee with mentioned id removed successfully..");
	}
	else
	{
		System.out.println("Employee with mentioned id is not present");
	}
}
}

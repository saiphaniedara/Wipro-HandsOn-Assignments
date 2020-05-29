import java.io.Serializable;
import java.util.Date;
public class Employee implements Serializable{
private String name;
private Date dateOfBirth;
private String department;
private double salary;
public Employee(String name,Date dob,String dep,double sal)
{
	this.name=name;
	dateOfBirth=dob;
	department=dep;
	salary=sal;
}
public void setName(String name)
{
	this.name=name;
}
public void setDate(Date dob)
{
	dateOfBirth=dob;
}
public void setDepartment(String dep)
{
	department=dep;
}
public void setSalary(double sal)
{
	salary=sal;
}
public String getName()
{
	return name;
}
public Date getDateOfBirth()
{
	return dateOfBirth;
}
public String getDepartment()
{
	return department;
}
public double getSalary()
{
	return salary;
}
}

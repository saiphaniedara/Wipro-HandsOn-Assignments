
public class Employee implements Cloneable{
String name;
int id;
int age;
double sal;
public Employee(String name,int id,int age,double sal)
{
	this.name=name;
	this.id=id;
	this.age=age;
	this.sal=sal;
}
public Employee clone()
{
	try
	{
		return (Employee)super.clone();
	}
	catch(CloneNotSupportedException e)
	{
		System.out.println("cloning is not allowed");
		return this;
	}
}
}

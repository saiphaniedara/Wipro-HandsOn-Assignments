package polymorphism;

class Fruit {
String name;
String taste;
double size;
public Fruit(String name,String taste,double size)
{
	this.name=name;
	this.taste=taste;
	this.size=size;
}
public void eat()
{
	System.out.println("Name is "+name);
	System.out.println("Taste is "+taste);
}
}

package polymorphism;

class Apple extends Fruit{
public Apple()
{
	super("apple","sweet",7.0);
}
public void eat()
{
	System.out.println("Name is "+name);
	System.out.println("Taste is "+taste);
}
}

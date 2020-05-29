package polymorphism;

class Orange extends Fruit{
public Orange()
{
	super("orange","sweet-tart",6.0);
}
public void eat()
{
	System.out.println("Name is "+name);
	System.out.println("Taste is "+taste);
}
}

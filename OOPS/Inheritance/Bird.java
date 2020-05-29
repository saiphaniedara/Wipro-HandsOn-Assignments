package inheritance;

class Bird extends Animal{
	public Bird()
	{
		System.out.println("Bird class Constructor");
	}
	public void eat()
	{
		System.out.println("Bird eats");
	}
	public void sleep()
	{
		System.out.println("Bird sleeps");
	}
	public void fly()
	{
		System.out.println("Bird flies");
	}
	public static void main(String[] args) {
		Animal animal=new Animal();
		animal.eat();
		animal.sleep();
		Bird bird=new Bird();
		bird.eat();
		bird.sleep();
		bird.fly();

	}

}

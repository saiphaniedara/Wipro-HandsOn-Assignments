package classesandobjects;

class Box {
int width;
int height;
int depth;
public Box(int width,int height,int depth)
{
this.width=width;
this.height=height;
this.depth=depth;
}
public int volume()
{
	return width*height*depth;
}
public static void main(String[] args)
{
	Box b1=new Box(10,20,30);
	System.out.println("The volume of the box is: "+b1.volume());

}
}

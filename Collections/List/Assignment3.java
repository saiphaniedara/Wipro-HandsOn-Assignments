package list_assignments;
import java.util.ArrayList;
import java.util.Iterator;
public class Assignment3 {
	public void printAll(ArrayList al)
	{
		Iterator iter=al.listIterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
	}
public static void main(String[] args)
{
	ArrayList<String> names=new ArrayList<String>();
	names.add("Phani");
	names.add("Surya");
	names.add("Sai");
	names.add("Stefan");
	names.add("Damon");
	names.add("Alaric");
	Assignment3 a3=new Assignment3();
	a3.printAll(names);
}
}

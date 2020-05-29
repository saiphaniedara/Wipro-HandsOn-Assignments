package sets_assignments;
import java.util.*;
public class Assignment3 {

	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("Trevor");
		ts.add("Bob");
		ts.add("Tom");
		ts.add("Jerry");
		ts.add("Rose");
		ts.add("Bheem");
		ts.add("Caroline");
		System.out.println("TreeSet before reversing: "+ts);
		System.out.println("Reverse Order of TreeSet elments: ");
		Iterator<String> iter=ts.descendingIterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		if(ts.contains("Jerry"))
		{
			System.out.println("Treeset contains element Jerry");
		}
		else
		{
			System.out.println("Treeset doesn't contain element Jerry");
		}
		if(ts.contains("Hattori"))
		{
			System.out.println("Treeset contains element Hattori");
		}
		else
		{
			System.out.println("Treeset doesn't contain element Hattori");
		}
	}

}

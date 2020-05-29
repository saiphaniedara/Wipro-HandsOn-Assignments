package sets_assignments;
import java.util.HashSet;
import java.util.Iterator;

public class Assignment2 {

	public static void main(String[] args) {
		HashSet<String> empNames=new HashSet<String>(); 
		empNames.add("Phani");
		empNames.add("Surya");
		empNames.add("Sai");
		empNames.add("Stefan");
		empNames.add("Damon");
		empNames.add("Elena");
		empNames.add("Bonnie");
		System.out.println("Employee Names are: \n");
		Iterator<String> hsiter=empNames.iterator();
		while(hsiter.hasNext())
		{
			System.out.println(hsiter.next());
		}
	}

}

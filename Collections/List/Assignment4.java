package list_assignments;

import java.util.Iterator;

public class Assignment4 {

	public static void main(String[] args) {
		NumberArrayList nal=new NumberArrayList<>();
		try
		{
			nal=new NumberArrayList<>();
			nal.add(10);
			nal.add(20.5f);
			nal.add(500L);
			nal.add(55.62);
			nal.add("Phani");
		}
		catch(ClassCastException e)
		{
			System.out.println(e);
		}
		Iterator iter=nal.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		
	}

}

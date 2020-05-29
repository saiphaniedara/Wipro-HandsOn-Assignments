package map_assignments;
import java.util.*;
public class Assignment3 {
	private Properties sac=new Properties();
	public void addProperty(String state,String capital)
	{
		sac.put(state,capital);
	}
	public void show()
	{
		Set s=sac.entrySet();
		Iterator iter=s.iterator();
		System.out.println("State\tCapital");
		while(iter.hasNext())
		{
			Map.Entry me=(Map.Entry)iter.next();
			System.out.println(me.getKey()+"\t"+me.getValue());
		}
	}
	public static void main(String[] args) {
		Assignment3 a3=new Assignment3();
		a3.addProperty("Andhra Pradesh","Amaravati");
		a3.addProperty("Arunachal Pradesh","Itanagar");
		a3.addProperty("Assam","Dispur");
		a3.addProperty("Bihar","Patna");
		a3.addProperty("Telangana","Hyderabad");
		a3.show();
	}

}

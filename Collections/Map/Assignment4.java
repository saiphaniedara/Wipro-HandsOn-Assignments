package map_assignments;
import java.util.*;
public class Assignment4 {
	private HashMap<String,Integer> contactList=new HashMap<String,Integer>();
	public void addContact(String name,int ph)
	{
		contactList.put(name,ph);
	}
	public void checkName(String name)
	{
		if(contactList.containsKey(name))
		{
			System.out.println("Name "+name+" exists in ContactList");
		}
		else
		{
			System.out.println("Name "+name+" doesn't exist in ContactList");
		}
	}
	public void checkPhoneNumber(int ph)
	{
		if(contactList.containsValue(ph))
		{
			System.out.println("Contact "+ph+" exists in ContactList");
		}
		else
		{
			System.out.println("Contact "+ph+" doesn't exist in ContactList");
		}
	}
	public void show()
	{
		Set s=contactList.entrySet();
		Iterator ir=s.iterator();
		System.out.println("Name\tPhone Number");
		while(ir.hasNext())
		{
			Map.Entry me=(Map.Entry)ir.next();
			System.out.println(me.getKey()+"\t"+me.getValue());
		}
	}
	public static void main(String[] args) {
		Assignment4 a4=new Assignment4();
		a4.addContact("Phani", 1234);
		a4.addContact("Surya",9618);
		a4.addContact("Alaric",2020);
		a4.checkName("Alaric");
		a4.checkName("Krishna");
		a4.checkPhoneNumber(1234);
		a4.checkPhoneNumber(7892);
		a4.show();

	}

}

package map_assignments;
import java.util.*;
public class Assignment2 {
	public boolean checkKey(HashMap<String,String> hm,String key)
	{
		return hm.containsKey(key);
	}
	public boolean checkValue(HashMap<String,String> hm,String val)
	{
		return hm.containsValue(val);
	}
	public void showMapData(HashMap<String,String> hm)
	{
		Set s=hm.entrySet();
		Iterator ir=s.iterator();
		while(ir.hasNext())
		{
			Map.Entry me=(Map.Entry)ir.next();
			System.out.println(me.getKey()+"\t"+me.getValue());
		}
	}
	public static void main(String[] args) {
		HashMap<String,String> hm=new HashMap<String,String>();
		hm.put("Sai","Phani");
		hm.put("Stefan","Salvatore");
		hm.put("Elena","Gilbert");
		hm.put("Bonnie","Bennett");
		hm.put("Alaric", "Saltzman");
		Assignment2 a2=new Assignment2();
		if(a2.checkKey(hm,"Alaric"))
		{
			System.out.println("Key Alaric is Present");
		}
		else
		{
			System.out.println("Key Alaric is not present");
		}
		if(a2.checkKey(hm,"Damonn"))
		{
			System.out.println("Key Damonn is Present");
		}
		else
		{
			System.out.println("Key Damonn is not present");
		}
		if(a2.checkValue(hm,"Gilbert"))
		{
			System.out.println("Value Gilbert is Present");
		}
		else
		{
			System.out.println("Value Gilbert is not present");
		}
		if(a2.checkValue(hm,"Lockwood"))
		{
			System.out.println("Value Lockwood is Present");
		}
		else
		{
			System.out.println("Value Lockwood is not present");
		}
		System.out.println("Map Data:");
		a2.showMapData(hm);
}

}

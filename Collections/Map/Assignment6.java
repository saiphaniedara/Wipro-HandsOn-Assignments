package map_assignments;
import java.util.*;
public class Assignment6 {
	private Hashtable<String,String> m1=new Hashtable<String,String>();
	public Hashtable<String,String> saveCountryCapital(String countryName,String capital)
	{
		m1.put(countryName,capital);
		return m1;
	}
	public String getCapital(String countryName)
	{
		return m1.get(countryName);
	}
	public String getCountry(String capitalName)
	{

		Set<String> entries=m1.keySet();
		Iterator<String> iter=entries.iterator();
		while(iter.hasNext())
		{
			String cname=iter.next();
			if(m1.get(cname)==capitalName)
			{
				return cname;
			}
		}
		return null;
	}
	public Hashtable<String,String> reverseMap()
	{
		Hashtable<String,String> m2=new Hashtable<String,String>();
		Set entries=m1.entrySet();
		Iterator iter=entries.iterator();
		while(iter.hasNext())
		{
			Map.Entry me=(Map.Entry)iter.next();
			m2.put((String)me.getValue(),(String)me.getKey());
		}
		return m2;
	}
	public ArrayList<String> getCountryNames()
	{
		ArrayList<String> countryNames=new ArrayList<String>();
		Set s=m1.keySet();
		Iterator<String> iter=s.iterator();
		while(iter.hasNext())
		{
			countryNames.add(iter.next());
		}
		return countryNames;
	}
	public static void main(String[] args) {
		Hashtable<String,String> ht=new Hashtable<String,String>();
		Assignment6 a6=new Assignment6();
		ht=a6.saveCountryCapital("India","Delhi");
		System.out.println(ht);
		ht=a6.saveCountryCapital("Japan","Tokyo");
		System.out.println(ht);
		ht=a6.saveCountryCapital("Afghanistan","Kabul");
		System.out.println(ht);
		ht=a6.saveCountryCapital("Australia","Canberra");
		System.out.println(ht);
		ht=a6.saveCountryCapital("Bhutan","Thimpu");
		System.out.println(ht);
		ht=a6.saveCountryCapital("Egypt","Cairo");
		System.out.println(ht);
		System.out.println("Capital of India is "+a6.getCapital("India"));
		System.out.println("Capital of Japan is "+a6.getCapital("Japan"));
		System.out.println("Country name of Capital Canberra is "+a6.getCountry("Canberra"));
		System.out.println("Country name of Capital Thimpu is "+a6.getCountry("Thimpu"));
		System.out.println("Capitals and their Country Names: ");
		System.out.println(a6.reverseMap());
		System.out.println("List of all Country Names: ");
		System.out.println(a6.getCountryNames());
	}

}

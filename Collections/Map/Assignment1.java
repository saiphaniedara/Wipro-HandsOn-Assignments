package map_assignments;
import java.util.*;
public class Assignment1 {
	HashMap<String,String> m1=new HashMap<String,String>();
	public HashMap<String,String> saveCountryCapital(String countryName,String capital)
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
	public HashMap<String,String> reverseMap()
	{
		HashMap<String,String> m2=new HashMap<String,String>();
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
		HashMap<String,String> hm=new HashMap<String,String>();
		Assignment1 a1=new Assignment1();
		hm=a1.saveCountryCapital("India","Delhi");
		System.out.println(hm);
		hm=a1.saveCountryCapital("Japan","Tokyo");
		System.out.println(hm);
		hm=a1.saveCountryCapital("Afghanistan","Kabul");
		System.out.println(hm);
		hm=a1.saveCountryCapital("Australia","Canberra");
		System.out.println(hm);
		hm=a1.saveCountryCapital("Bhutan","Thimpu");
		System.out.println(hm);
		hm=a1.saveCountryCapital("Egypt","Cairo");
		System.out.println(hm);
		System.out.println("Capital of India is "+a1.getCapital("India"));
		System.out.println("Capital of Japan is "+a1.getCapital("Japan"));
		System.out.println("Country name of Capital Canberra is "+a1.getCountry("Canberra"));
		System.out.println("Country name of Capital Thimpu is "+a1.getCountry("Thimpu"));
		System.out.println("Capitals and their Country Names: ");
		System.out.println(a1.reverseMap());
		System.out.println("List of all Country Names: ");
		System.out.println(a1.getCountryNames());
	}

}

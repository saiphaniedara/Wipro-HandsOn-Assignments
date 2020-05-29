package map_assignments;
import java.util.*;
public class Assignment5 {
	private TreeMap<String,String> m1=new TreeMap<String,String>();
	public TreeMap<String,String> saveCountryCapital(String countryName,String capital)
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
	public TreeMap<String,String> reverseMap()
	{
		TreeMap<String,String> m2=new TreeMap<String,String>();
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
		TreeMap<String,String> tm=new TreeMap<String,String>();
		Assignment5 a5=new Assignment5();
		tm=a5.saveCountryCapital("India","Delhi");
		System.out.println(tm);
		tm=a5.saveCountryCapital("Japan","Tokyo");
		System.out.println(tm);
		tm=a5.saveCountryCapital("Afghanistan","Kabul");
		System.out.println(tm);
		tm=a5.saveCountryCapital("Australia","Canberra");
		System.out.println(tm);
		tm=a5.saveCountryCapital("Bhutan","Thimpu");
		System.out.println(tm);
		tm=a5.saveCountryCapital("Egypt","Cairo");
		System.out.println(tm);
		System.out.println("Capital of India is "+a5.getCapital("India"));
		System.out.println("Capital of Japan is "+a5.getCapital("Japan"));
		System.out.println("Country name of Capital Canberra is "+a5.getCountry("Canberra"));
		System.out.println("Country name of Capital Thimpu is "+a5.getCountry("Thimpu"));
		System.out.println("Capitals and their Country Names: ");
		System.out.println(a5.reverseMap());
		System.out.println("List of all Country Names: ");
		System.out.println(a5.getCountryNames());
	}

}
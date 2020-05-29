package sets_assignments;
import java.util.HashSet;
public class Assignment1 {
	private HashSet<String> h1=new HashSet<String>();
	public HashSet<String> saveCountryNames(String countryName)
	{
		h1.add(countryName);
		return h1;
	}
	public String getCountry(String countryName)
	{
		if(h1.contains(countryName))
		{
			return countryName;
		}
		else
		{
			return null;
		}
	}
	public static void main(String[] args) {
		Assignment1 a1=new Assignment1();
		String[] countryNames= {"India","USA","United Kingdom","Canada","Germany","Italy","Sri Lanka","South Africa","India","Canada","India"};
		HashSet<String> hs=new HashSet<String>();
		for(String s:countryNames)
		{
			hs=a1.saveCountryNames(s);
			System.out.println(hs);
		}
		String cname=a1.getCountry("India");
		if(cname!=null)
		{
			System.out.println("Country "+cname+" found..");
		}
		else
		{
			System.out.println("Country Not found...");
		}
		cname=a1.getCountry("Italy");
		if(cname!=null)
		{
			System.out.println("Country "+cname+" found..");
		}
		else
		{
			System.out.println("Country Not found...");
		}
		cname=a1.getCountry("Spain");
		if(cname!=null)
		{
			System.out.println("Country "+cname+" found..");
		}
		else
		{
			System.out.println("Country Not found...");
		}
	}

}

package sets_assignments;
import java.util.TreeSet;
public class Assignment4 {
	private TreeSet<String> h1=new TreeSet<String>();
	public TreeSet<String> saveCountryNames(String countryName)
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
		Assignment4 a4=new Assignment4();
		String[] countryNames= {"India","USA","United Kingdom","Canada","Germany","Italy","Sri Lanka","South Africa","India","Canada","India"};
		TreeSet<String> ts=new TreeSet<String>();
		for(String s:countryNames)
		{
			ts=a4.saveCountryNames(s);
			System.out.println(ts);
		}
		String cname=a4.getCountry("India");
		if(cname!=null)
		{
			System.out.println("Country "+cname+" found..");
		}
		else
		{
			System.out.println("Country Not found...");
		}
		cname=a4.getCountry("Italy");
		if(cname!=null)
		{
			System.out.println("Country "+cname+" found..");
		}
		else
		{
			System.out.println("Country Not found...");
		}
		cname=a4.getCountry("Spain");
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

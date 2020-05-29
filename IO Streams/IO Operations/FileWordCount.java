import java.io.*;
import java.util.*;
public class FileWordCount {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter input File Name: ");
		String fname=sc.next();
		FileReader fr=new FileReader(fname);
		TreeMap<String,Integer> wordcount=new TreeMap<String,Integer>();
		int c;
		String text="";
		while((c=fr.read())!=-1)
		{
			if((char)c!='\n')
			{
				if((char)c=='\r')
				{
					text+=" ";
				}
				else
				{
					text+=(char)c;
				}
			}
		}
		String[] words=text.split(" ");
		fr.close();
		for(String s:words)
		{
		if(wordcount.containsKey(s))
		{
			wordcount.replace(s,wordcount.get(s)+1);
		}
		else
		{
			wordcount.put(s,1);
		}
		}
		FileWriter fw=new FileWriter("outputFile.txt");
		Set es=wordcount.entrySet();
		Iterator itr=es.iterator();
		while(itr.hasNext())
		{
			Map.Entry me=(Map.Entry)itr.next();
			text=me.getKey()+" : "+me.getValue()+"\n";
			fw.write(text);
		}
		fw.close();
		System.out.println("The Output has been stored in outputFile.txt");
	}

}

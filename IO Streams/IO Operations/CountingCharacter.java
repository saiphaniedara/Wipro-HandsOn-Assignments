import java.io.*;
public class CountingCharacter {

	public static void main(String[] args) throws IOException{
		
		FileInputStream fis=null;
		try
		{
			System.out.println("Enter the file name: ");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			String fname=br.readLine();
			fis=new FileInputStream(fname);
			System.out.println("Enter the character to be counted: ");
			char key=br.readLine().charAt(0);
			int c;
			int count=0;
			while((c=fis.read())!=-1)
			{
				if(Character.toUpperCase(c)==key||Character.toLowerCase(c)==key)
				{
					count++;
				}
			}
			System.out.println("File \'"+fname+"\' has "+count+" instances of letter \'"+key+"\'.");
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Enter correct file name...");
		}
		finally
		{
			fis.close();
		}
	}

}

import java.io.*;
public class CopyingFileToFile {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter the Input File Name: ");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String finname=br.readLine();
		FileInputStream fis=new FileInputStream(finname);
		System.out.println("Enter the output file name: ");
		String foutname=br.readLine();
		FileOutputStream fos=new FileOutputStream(foutname);
		int c;
		while((c=fis.read())!=-1)
		{
			fos.write(c);
		}
		System.out.println("File is copied");
		fis.close();
		fos.close();
	}

}

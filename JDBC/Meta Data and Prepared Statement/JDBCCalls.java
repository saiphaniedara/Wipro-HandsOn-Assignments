public class JDBCCalls {
	public static void main(String[] args) throws Exception
	{
		int ch=Integer.parseInt(args[0]);
		DAOClass da=new DAOClass();
		switch(ch)
		{
		case 1:
			int id=Integer.parseInt(args[1]);
			double fee=Double.parseDouble(args[5]);
			da.insert(id,args[2],args[3],args[4],fee);
			da.close();
			break;
		case 2:
			int a=Integer.parseInt(args[1]);
			da.delete(a);
			da.close();
			break;
		case 3:
			int b=Integer.parseInt(args[1]);
			double f=Double.parseDouble(args[2]);
			da.update(b, f);
			da.close();
			break;
		case 4:
			if(args.length==1)
			{
				da.display();
			}
			else
			{
				int c=Integer.parseInt(args[1]);
				da.display(c);
			}
			da.close();
			break;
		default:
			System.out.println("Invalid option");
			break;
		}
	}
}

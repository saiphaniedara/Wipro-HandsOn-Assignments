
public class Assignment13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length!=4) {
			System.out.println("Please enter 4 integer numbers");
		}
		else {
			int s=0;
			System.out.println("The given array is :");
			for(int i=0;i<2;i++) {
				for(int j=0;j<2;j++) {
				System.out.print(args[s]+" ");
				s++;
				}
				System.out.println();
			}
			System.out.println("The reverse of the array is :");
			for(int i=0;i<2;i++)
			{
				for(int j=0;j<2;j++) {
					s--;
					System.out.print(args[s]+" ");
				}
				System.out.println();
			}
		}
	}

}

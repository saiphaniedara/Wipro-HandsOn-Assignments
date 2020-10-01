
public class Assignment14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length!=9) {
			System.out.println("Please enter 9 integer numbers");
		}
		else {
			int[][] a = new int[3][3];
			int s=0;
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					a[i][j]=Integer.parseInt(args[s]);
					s++;
				}
			}
			System.out.println("The given array is : ");
			int big=0;
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					System.out.print(a[i][j]+" ");
					if(a[i][j]>big) {
						big = a[i][j];
					}
				}
				System.out.println();
			}
			System.out.println("The biggest number in the given array is : "+big);
		}
	}

}

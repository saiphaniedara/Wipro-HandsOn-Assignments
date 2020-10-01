import java.util.Scanner;

public class Assignment11 {
	public static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter size of the Array: ");
		int n = sc.nextInt();
		System.out.println("Enter 4 numbers: ");
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		boolean res=true;
		for(int i=0;i<n;i++) {
			if(arr[i]!=1&&arr[i]!=4) {
				res=false;
			}
		}
		System.out.println(res);
	}

}

import java.util.Scanner;

public class Assignment12 {
	private static Scanner sc =new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter 1st array elements: ");
		int[] a = new int[3];
		for(int i=0;i<3;i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Enter 2nd array elements: ");
		int[] b = new int[3];
		for(int i=0;i<3;i++) {
			b[i] = sc.nextInt();
		}
		System.out.println("["+a[1]+","+b[1]+"]");
	}

}

package interfaces;

public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		KidUsers kid1=new KidUsers(10,"kids");
		System.out.println("Kid User 1 of age 10 and BookType \"kids\":\n");
		kid1.registerAccount();
		kid1.requestBook();
		System.out.println();
		KidUsers kid2=new KidUsers(9,"fiction");
		System.out.println("Kid User 2 of age 9 and BookType \"fiction\":\n");
		kid2.registerAccount();
		kid2.requestBook();
		System.out.println();
		KidUsers kid3=new KidUsers(14,"kids");
		System.out.println("Kid User 3 of age 14 and BookType \"kids\":\n");
		kid3.registerAccount();
		System.out.println();
		AdultUsers adult1= new AdultUsers(15,"fiction");
		System.out.println("Adult User 1 of age 15 and BookType \"fiction\":\n");
		adult1.registerAccount();
		adult1.requestBook();
		System.out.println();
		AdultUsers adult2= new AdultUsers(17,"kids");
		System.out.println("Adult User 2 of age 17 and BookType \"kids\":\n");
		adult2.registerAccount();
		adult2.requestBook();
		System.out.println();
		AdultUsers adult3= new AdultUsers(10,"fiction");
		System.out.println("Adult User 3 of age 10 and BookType \"fiction\":\n");
		adult3.registerAccount();
		
	}

}

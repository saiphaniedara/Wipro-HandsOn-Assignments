package encapsulation;

class Book {
String bName;
Author author;
double price;
int qtyInStock;
public Book(String bName,String aName,String aEmail,char aGender,double price,int qtyInStock)
{
	this.bName=bName;
	author=new Author(aName,aEmail,aGender);
	this.price=price;
	this.qtyInStock=qtyInStock;
}
public void printDetails()
{
	System.out.println("Book Details are :");
	System.out.println("Book Name: "+bName);
	System.out.println("Author Name: "+author.aName);
	System.out.println("Author Email: "+author.aEmail);
	System.out.println("Author Gender: "+author.aGender);
	System.out.println("Book Price: "+price);
	System.out.println("Quantity of Books in Stock: "+qtyInStock);
}
public static void main(String[] args)
{
	Book book1=new Book("Java Notes","Phani","eedarasaiphani2000@gmail.com",'m',500.00,12);
	book1.printDetails();
}
}

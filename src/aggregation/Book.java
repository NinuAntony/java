package aggregation;

public class Book {
	Author author;
	String bookname;
	int price;

	public Book(Author author, String bookname, int price) {
		super();
		this.author = author;
		this.bookname = bookname;
		this.price = price;
		System.out.println(bookname+" "+price);
		System.out.println(author.name+" "+author.place+" "+author.age);
	}

	public static void main(String[] args) {
		Author author1=new Author("hector gracia","japan",45);
		Book book1=new Book(author1,"IKIGAI",149);

	}

}

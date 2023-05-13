package aggregation;

public class LineItem {
	int quantity;
	Product product;
	public LineItem(int quantity, Product product) {
		super();
		this.quantity = quantity;
		this.product = product;
	}
	void display() {
		System.out.println("quantity is" +" "+quantity);
		System.out.println("product.id is"+" "+product.id);
		System.out.println("product name:"+" "+product.name);
		System.out.println("product description:"+" "+product.description);
	}

	public static void main(String args[])
	{
		Product products=new Product(7884,"mixer grinder","philips");
		LineItem item=new LineItem(1,products);
		item.display();
	}
}

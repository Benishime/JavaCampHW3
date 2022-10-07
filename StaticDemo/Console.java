package StaticDemo;

public class Console {

	public static void main(String[] args) {
		ProductManager manager = new ProductManager();
		Product product = new Product();
		product.price=100;
		product.name="mouse";
		manager.add(product);
		
		
		
		Databasehelper.crud.Connection.creatConnetion();
	}

}

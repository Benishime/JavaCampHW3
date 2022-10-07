package AbstractDemo;

public class Console {

	public static void main(String[] args) {
		MainDatabase mysql = new Mysql();
		MainDatabase oracle = new Oracle();
		mysql.Add();
		oracle.Add();
		oracle.Remove();  
		CustomerManager customer = new CustomerManager();
		customer.database = new Mysql();
		customer.removeCustomer();
		
		

	}

}

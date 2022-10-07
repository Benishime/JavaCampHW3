package Interfaces;

public class Console {

	public static void main(String[] args) {
		ICustomerDal iCustomerDal = new MySqlCustomerDal();
		iCustomerDal.Add();
		
		CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
		customerManager.Add();
	}

}

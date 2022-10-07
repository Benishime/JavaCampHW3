package AbstractDemo;

public class CustomerManager {
	MainDatabase database;
	
	public void GetCustomer(){
		database.Get();
	}
	public void addCustomer(){
		database.Add();
	}
	public void removeCustomer(){
		database.Remove();
	}
	public void updateCustomer(){
		database.Update();
	}
}

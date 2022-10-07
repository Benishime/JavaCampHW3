package Polymorphısm;

public class Console {

	public static void main(String[] args) {
//		EmailLogger email = new EmailLogger();
//		DataBaseLooger database = new DataBaseLooger();
//		database.log("mesaj");
//		email.log("selam");
		
		
//		BaseLogger[] loggers = new BaseLogger[]{new FileLogger(),new EmailLogger(),new DataBaseLooger(),new ConsolLogger()};
//		for(BaseLogger logger : loggers) {
//			logger.log("mesaj");
//		}
		CustomerManager Customer = new CustomerManager(new FileLogger());
		Customer.add();
		
		
	}

}

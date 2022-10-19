package polymorphismDemo;

public class Main {

	public static void main(String[] args) {
		
	BaseLogger[] loggers=new BaseLogger[] {new FileLogger(),new DatabaseLogger(),new ConsoleLogger(),new EmailLogger()};
		
		for(BaseLogger logger:loggers) {
			logger.log("Log Mesajý");
		}
		
		
		CustomerManager customerManager=new CustomerManager(new FileLogger());
		customerManager.add();
		
		
		
		
	}

}

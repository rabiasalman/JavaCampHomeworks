package oopYoutubeVideos;

public class CustomerManager {
	
	private Customer customer;
	ICreditManager creditManager;
	
	public CustomerManager(Customer customer,ICreditManager creditManager) {
		this.customer=customer;
		this.creditManager=creditManager;
		
		
	}
	
	
	public void save() {
		System.out.println("Kaydedildi");
	}

	
	public void delete() {
		System.out.println("Silindi:");
	}
	
	
	public void giveCredit() {
		creditManager.calculate();
		System.out.println("Kredi Verildi");
	}
	
}

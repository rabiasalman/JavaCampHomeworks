package inheritance;

public class Main {

	public static void main(String[] args) {
 	
	/*Inheritance(Kalýtým-Miras)
	 *Kalýtým, classlarýn birbirinin özelliklerini tekrar etmeden baþka
	 *bir class üzerinden geniþletebilmelerine imkan saðlayan yapýlardýr.
	 
	 * Inheritance ile kod tekrarýnýn önüne geçilir ve nesneler arasýndaki
	 * iliþkilerin dah kolay yönetebilmesini saðlar.
	 
	 * Bir class sadece extens ettiði classýn içindeki bilgileri alýr.Baþka bir classýn
	 * içindeki bilgileri alamaz.
	*/
		
		Customer customer=new Customer();
	    Employee employee=new Employee();
	    
	    EmployeeManager employeeManager=new EmployeeManager();
	    employeeManager.add();
	    employeeManager.list();
	    employeeManager.bestEmployee();
	    System.out.println("---------------------------");
	    CustomerManager customerManager=new CustomerManager();
	    customerManager.add();
	    customerManager.list();
	    
	
	}

}

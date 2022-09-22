package classesWithAttributes;

public class Product {

//Single-responsibility-principle(Tek Sorumluluk Prensipi):Bir class bir metot sadece bir iþi yapar
//Classlarýn bir diðer özelliðide özellik tutmasý Field vaye Attribute olarak isimlendirilirler
//Private:Sadece tanýmlandýðý blokta geçerlidir	
	
	private int id;
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String renk;
	private String kod;
	
//Yapýcý blok isimleri Class ismiyle ayný olmak zorundadýr,
//New'lediðimizde çalýþan bloðu devreye sokmuþ oluruz
//Parmetreli Constructor
	public Product(int id, String name,String description,double price,int stockAmount,String renk) {
	    System.out.println("Yapýcý blok çalýþtý");
		this.id=id;
		this.name=name;
		this.description=description;
		this.price=price;
		this.stockAmount=stockAmount;
		this.renk=renk;
	}
	
	//Parametresiz Constructor
	public Product() {
		
	}
	
//Encapsulation(Kapsülleme):Herhangibir alaný kullanmak için kýsýtlamayý ön görür.
//get:Bir deðeri okumaya yönelik iþlemdir.(Read)
//set:Bir deðere deðerini vermeye yönelik iþlemdir.(Write)
//set edilen deðer parametre olarak verilir.


/*Doðrudan eriþim ,daha büyük ve doðrudan anlaþýlmayacak hatalarada sebep olabilir
 *Bu yüzden her sýnýf kendi alanýnýn yönetiminden kendisi sorunlu olmalýdýr.
 *Sýnýf içerisindeki alanlara eriþim ancak sýnýfýn kendi istegi ile dýþarýya açtýðý GETTER ve SETTER metotlarý aracýlýðý ile olmalýdýr*/
	
	public int   getId() {
		return id;
	}
	
	public void  setId(int id) {
	   this.id=id;
	}
	

	public String getName() {
		return name;
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getDescription() {
		return description;
	}
	

	public void setDescription(String description) {
		this.description = description;
	}
	

	public double getPrice() {
		return price;
	}
	

	public void setPrice(double price) {
		this.price = price;
	}
	

	public int getStockAmount() {
		return stockAmount;
	}
	

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}
	
	
	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}
	

	public String getKod() {
		return this.name.substring(0,1)+id;
	}
	
	
	
	
}
	
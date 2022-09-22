package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
	    //Parmetreli Constructor kullanýmý
		Product product=new Product(1,"Laptop","Asus Laptop",3000,2,"Siyah");
		
		
	

		
       ProductManager productManager=new ProductManager();
	   productManager.add(product);
	   
	   System.out.println(product.getKod());
		
	  

	}

}

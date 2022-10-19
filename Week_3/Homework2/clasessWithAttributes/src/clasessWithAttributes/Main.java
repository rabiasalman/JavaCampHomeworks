package clasessWithAttributes;

public class Main {

	public static void main(String[] args) {
	
		Product product=new  Product(1,"Laptop","Asus Laptop",5000,3,"Sarý");
		
		ProductManager productManager=new ProductManager();
		productManager.add(product);
		System.out.println(product.getKod());
		
	}

}

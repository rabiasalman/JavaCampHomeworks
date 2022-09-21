package switchDemo;

public class Main {

	public static void main(String[] args) {
	//Þartlý Dallandýrma bloklarý
	//Bir öðrencinin bir sýnavdan aldýðý nota göre ona mesaj vermeye yönelik bir program yazýn.
		
	char grade='C';
	switch(grade) {
	
	//Durum
	case 'A':System.out.println("Mükemmel:Geçtiniz");break;
	
	case 'B':
	case 'C':
		System.out.println("Ýyi:Geçtiniz");break;
	
	case 'D':System.out.println("Fena Deðil:Geçtiniz");break;
	
	case 'F':System.out.println("Malesef:Kaldýnýz");break;
	
	default	:
		System.out.println("Geçersiz Not Girdiniz");
		//istenilen durum sart saðlamýyorsa çalýþacak kodlar
	}
		
	
	}

}

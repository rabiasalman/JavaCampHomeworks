package loopDemo;


public class Main {

	public static void main(String[] args) {
	//Döngüler programda birbirine benzeyen iþlemleri tekrarlamaya yarar.
	
	//1'den 10'a kadar yazdýrma.
	//int i:baþlangýç
	//i<=100:þart bitiþ
	//i++:artýþ
		
	for (int i = 1; i <=10; i++) {
		System.out.println(i);	
	}
	System.out.println("Döngü bitti");
	
	
	//1-10 arasý çift sayýlarý yazdýrma.

	for (int i = 2; i <=10; i+=2) {
		System.out.println(i);	
	}
	System.out.println("Döngü bitti");
	
	
	//1-10 arasý tek sayýlarý yazdýrma.
	
	for (int i = 1; i <=10; i+=2) {
		System.out.println(i);	
	}
	System.out.println("For Döngüsü Bitti");
	
	
	//WHÝLE DÖNGÜSÜ
	//1-10 arasý çift sayýlarý yazdýrýn.
	int i=1;
	while(i<10) {
		System.out.println(i);
		i+=2;	
	}
	System.out.println("While Döngüsü Bitti");
	
	
	//DO WHÝLE DÖNGÜSÜ
	//Do While döngüsü þart saðlanmasa bile en az iþlemi 1 kere gerçekleþtirir.
	int j=100;
	do {
	    System.out.println("Loglandý");
		System.out.println(j);
		j+=2;	
		
	}while(j<10);
	System.out.println("Do While Döngüsü Bitti");
	
	
	
	}

}

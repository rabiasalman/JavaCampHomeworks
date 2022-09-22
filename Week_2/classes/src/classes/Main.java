package classes;

public class Main {

	public static void main(String[] args) {

	//Bir classı kullanmak için onun NEW'lenmesi gerek.
	//Classlar REFERANS tiptir.
		
		
	//CustomerManager sınıfından bir nesne oluşturuldu.
	//Classın çağırımı bu şekildedir
	 CustomerManager customerManager=new CustomerManager();
	 CustomerManager customerManager2=new CustomerManager();
	//customerManager referans numarası customerManager2'nin referans numarasıdır
	 customerManager=customerManager2;
	 customerManager.add();
	 customerManager.remove();
	 customerManager.update();
	 
	 
	//Değer tipte birşey tanımladığımızda heap'le hiçbir alakası yok herşey stack'te oluşur.
	//Value Type
	 int sayi1=10;
	 int sayi2=20;
	 sayi2=sayi1;
	 sayi1=30;
	 System.out.println(sayi2);
	 
	 
	 //Diziler referans tiptir
	 int[] sayilar1=new int[] {1,2,3};
	 int[] sayilar2=new int[] {4,5,6};
	 sayilar2=sayilar1;//sayilar2'nin değeri sayilar1 değeri
	 sayilar1[0]=10;
	 System.out.println(sayilar2[0]);
		
	}

}


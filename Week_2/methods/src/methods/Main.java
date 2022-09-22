package methods;

public class Main {

	public static void main(String[] args) {		
		sayiBulmaca();
	}
	//Metod,yanlýzca  çaðrýldýðýnda çalýþan bir kod bloðudur.
	//Metod birden çok yerde çaðýrýlabilir.
	//Mainde bir metodtur.
	//Metodlar belirli eylemleri gerçekleþtirmek için kullanýlýr.Bunlara iþlevlerde denilir.
	//Kendi metodlarýmýzý oluþturabiliriz.
	//Metod yazarak kendimizi tekrarlamamýza engel oluruz
	//Javada metot isimleri camelCase þeklinde yazýlýr.
	
	//Parametresiz metod
	public static void sayiBulmaca() {
		
		  int[] sayilar=new int[] {1,2,5,7,9,0};
		     int aranacak=55;
		     boolean varMi=false;
		     
		     for(int sayi:sayilar) {
		    	 if(sayi==aranacak) {
		    		varMi=true;
		    		break;
		    		
		    	 }
		     }
		     if(varMi) {
		    	mesajVer("Sayý Mevcuttur:"+aranacak);
		     }else {
		    	mesajVer("Sayý Mevcut Deðildir:"+aranacak);
		     }	
	}
	
	
	//Parametreli metod
	 public static void mesajVer(String mesaj  ) {
		
		 System.out.println(mesaj);
	 }

}

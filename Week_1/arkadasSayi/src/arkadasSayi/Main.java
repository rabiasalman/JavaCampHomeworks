package arkadasSayi;

public class Main {

	public static void main(String[] args) {
	
		int sayi1=220;
		int sayi2=284;
		int bolenToplam1=0;
		int bolenToplam2=0;
		for(int i=1;i<sayi1;i++) {
			if(sayi1%i==0) {
				bolenToplam1=bolenToplam1+i;
			}
		}
		for(int i=1;i<sayi2;i++) {
			if(sayi2%i==0) {
				bolenToplam2=bolenToplam2+i;
			}
		}
		if(sayi1==bolenToplam2 && sayi2==bolenToplam1) {
			System.out.println("Arkadaþ sayýdýr");
		}
		else {
			System.out.println("Arkadaþ Sayý Deðildir");
		}
	}

}

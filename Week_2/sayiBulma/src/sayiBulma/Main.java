package sayiBulma;

public class Main {

	public static void main(String[] args) {
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
    	 System.out.println("Say� Mevcuttur");
     }else {
    	 System.out.println("Say� Mevcut De�ildir");
     }
     
     
	}

}

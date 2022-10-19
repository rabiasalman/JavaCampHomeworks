package oopYoutubeVideos;

public abstract class BaseCreditManager implements ICreditManager {
   
	
	//Ortak deðil heryerde deðiþken
	public abstract void calculate();
	
	public void save() {
		System.out.println("Kaydedildi");
	}

}

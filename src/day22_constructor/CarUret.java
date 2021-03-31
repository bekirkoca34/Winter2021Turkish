package day22_constructor;

public class CarUret {
	// soru.... CONSTRUCTOR bu CLASS da nerede?
	
	// su anda bu class'da gorunur bir constructor yok
	// bir Class olusturuldugunda Java bu Class'dan obje uretilecegini bilir
	// ve gorunmeyen DEFAULT CONSTRUCTOR' i Class'a yerlestirir.
	// dafault contructor parametresizdir dolaysiyla sadece hicbir ozelligi tanimlanamayan 
	// objeler uretir (tisort uret demek gibidir)
	// dafault constructor ile uretilen bir objenin tum ozellikleri sonradan tanimlanmalidir.
	
	// eger biz sonradan bir constructor yazarsak, Java default constructor'i iptal eder.
	
	// Bir constructor olusturalim,
	public CarUret (){
		
	}
	// kurallar 1- ismi class ile ayni olmalidir(dolaysiyla buyuk harf ile baslar)
	//          2- Constructor return type'a sahip degildir.
	//          3- Constructor isminden sonra () mutlaka olur ama paramtre olmasi opsiyoneldir
	//          4 Bir constructor olusturuldugunda kimlerin kullanacagini belirlemek icin acces modifier yazilir
	
	String marka;
    String model;
    int yil;
    boolean kazasiVarMi;
    
	// bir programda cok fazla uretecegimiz objeler icin bir tane class olustururuz
    // bu class' da olusturulacak objelere ait tum ozellikler olur
    // bu class direk calistirilmayacagi icin main method gerekmez
    // (kaliphane gibidir)
	
	public void yakit(String yakit) {
		System.out.println("Araba yakit olarak " + yakit + " kullanir");
	}

	public void vites(String vites) {
		System.out.println("Araba " + vites + " viteslidir");
	}
}

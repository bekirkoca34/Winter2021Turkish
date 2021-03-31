package day22_constructor;

public class Otomobil {
	
	public Otomobil(String renk){ // istersek contructor' i parametreli olarak olusturabilirz
		
	}
	// Biz bir contructor olusturdugumuzda Java default olani yok eder
	// Dolaysiyla biz bir constructor olusturdugumuzda mutlaka 
	// default constructor'in yerine de bir constructor yazmaliyiz
	public Otomobil() {// default constructor'in yerine bunu yazmaliyiz
		
	}
	// Onemli not: default constructor'dan baska bir constructor yazdigimizda 
	// Java default olani yok ettigi icin MUTLAKA biz default yerine de constructor yazmaliyiz
	
	String marka;
    String model;
    int yil;
    boolean kazasiVarMi;
	
	
    public void yakit(String yakit) { //method
		System.out.println("Araba yakit olarak " + yakit + " kullanir");
	}

	public void vites(String vites) { // method
		System.out.println("Araba " + vites + " viteslidir");
	}
	
	
}

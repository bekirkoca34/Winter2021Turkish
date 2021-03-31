package day35_inheritance;

public class Memur extends Personel{

	public int maas;
	
	
	public Memur() {
		super();
		System.out.println("Child class parametresiz cons. calisti");
	}

	
	public Memur(int maas) {
		super();
		System.out.println("Child class parametreli cons. calisti");

		
	}
	
    /*
     Inheritance de cons.olusturdugumuzda java' nin otomatik olarak cons. 'a koydugu super() keywoerd onemlidir.
     super() keyword default cons. gibidir. Biz gormesekde calisir. 
     ancak yerine baska bir keyword yazarsak etkisiz hale gelir.
     **** extend varsa yerine birsey yazmadıkca super() calisir...***
     
     */
	public static void main(String[] args) {
		
		Memur obj1=new Memur(2400);
	
	}

	

}

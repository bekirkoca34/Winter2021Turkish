package day22_constructor;

public class Car {
    String marka;
    String model;
    int yil;
    boolean kazasiVarMi;
    
	
	public static void main(String[] args) {
		
		Car car1=new Car();
		// 1- bir object olusturuldugunda  esitligin saginda mutlaka Constructor kullanilir.
		// 2- Constructor ismi class ismi ile ayni olmalidir.
		// 3- Constructor da mutlaka () olmalidir.
		// 4 - Constructor da parametre olmasi istege baglidir.
		
		System.out.println(car1.marka+" "+ car1.model + " " + car1.yil + " " + car1.kazasiVarMi);
		//null null 0 false (default degerler)
		car1.marka="Toyota";
		car1.model="Corolla";
		car1.yil=2010;
		car1.kazasiVarMi=false;
		System.out.println(car1.marka+" "+ car1.model + " " + car1.yil + " " + car1.kazasiVarMi);
		// Toyota Corolla 2010 false
		
		Car car2=new Car();
		car2.marka="Opel";
		car2.model="Astra";
		car2.yil=2015;
		car2.kazasiVarMi=true;
		System.out.println(car2.marka+" "+ car2.model + " " + car2.yil + " " + car2.kazasiVarMi);
		// Opel Astra 2015 true
		System.out.println(car1.marka+" "+ car1.model + " " + car1.yil + " " + car1.kazasiVarMi);
		// Toyota Corolla 2010 false
		
		car1.kazasiVarMi=true;// car1 'e ait herhangi bir ozelligi degistirebilirz
		System.out.println(car1.marka+" "+ car1.model + " " + car1.yil + " " + car1.kazasiVarMi);
		//Toyota Corolla 2010 true
	}

}

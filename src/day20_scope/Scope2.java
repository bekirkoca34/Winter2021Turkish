package day20_scope;

public class Scope2 {

	public static void main(String[] args) {
		// ben farkli class'lardan da Scope1 class'ina object olusturarak ulasabilirm
		
		Scope1 obj4= new Scope1();
		obj4.soyisim="Can";
		obj4.isim="Ahmet";
		
		System.out.println(obj4.isim + " " + obj4.soyisim);
		
		
		
		

	}

}

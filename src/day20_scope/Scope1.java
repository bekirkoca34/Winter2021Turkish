package day20_scope;

import java.util.Scanner;

public class Scope1 {

	int sayi;// class' in icinde fakat main method'un disinda olusturulan
				// ve static olmayan variable 'lara INSTANCE (object) variable denir.
				// class level' da olusturldugu icin class' in her yerinden belli sartlarla
				// kullanilabilir.
				// Instance variable'lar object'e bagli olarak calısır.(Ogretmen adi)
	public String isim = "Mehmet";
	public String soyisim; // default degeri null
	boolean icindeMi; // default degeri false,
	char ilkHarf; // default degeri space

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// System.out.println(sayi);// static olmayan bir variable' a static method
		// icinden ulasamayiz.
		// main method static oldugu icin main method icerisinden
		// method(); // static olmayan variable veya method'lara direk olasamayiz

		// instance bir variable'a main method icerisinden ulasmak istedigimizde
		// OBJECT olusturmaliyiz.

		Scanner scan = new Scanner(System.in);// bu java' da standart obje olusturma formudur.
		// class ismi objeismi obje olusturmada keyword class ismi()

		Scope1 obj1 = new Scope1();
		System.out.println(obj1.sayi);
		System.out.println(obj1.isim);
		System.out.println(obj1.soyisim);// buna deger atamadik Java default deger olrak null verdi.
		// Instance variable'lar olusturuldugunda biz istersek deger atayabilirz
		// instance variable'lara biz deger atamazsak Java default deger atar.

		Scope1 obj2 = new Scope1();
		obj2.isim = "Muslum";
		obj2.soyisim = "Baba";
		System.out.println(obj2.isim + " " + obj2.soyisim);// Muslum Baba
		System.out.println(obj1.isim + " " + obj1.soyisim);// Mehmet null
		System.out.println(obj2.icindeMi);// false // boolean degerlerin dafault degeri false
		System.out.println(obj2.ilkHarf);// space

		Scope1 obj3 = new Scope1();
		obj3.isim = "ferdi";
		obj3.soyisim = "Tayfur";
		obj3.icindeMi = true;
		System.out.println(obj3.isim + " " + obj3.soyisim + " " + obj3.icindeMi);

	}

	public static void staticMethod() {

	}

	public void method() {
		System.out.println(sayi);// bu method static olmadigi icin instance variable'lara direkt ulasabilir
	}

}

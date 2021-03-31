package day33_encapsulation;

import day20_scope.Scope1;
import day21_scope.Scope6;

public class Encapsulation01 {

	public static void main(String[] args) {
		// OOP concept
		// Object Orient Programming
		// 
		
		
		// scope6 class'indaki variable ve methodlara ulasmak istiyorum
		// bunun icin scope6 class' indan obje uretmeliyiz
		
		Scope6 obj1= new Scope6();
		//esitligin sol tarafı declaration
		// declaration 2 parcadir ilki data turu, ikincisi isim
		// non-pritimive'ler icin data ayni zaman class ismi olabilir
	    // esitligin saginda ise deger, 2 parcadan olusur
		// new keyword ve constructor
		// hangi class' dan obje uretmek istersek o class'in constructor'ini kullaniriz
		
		obj1.num1=10;
		System.out.println(obj1.num1);// 10 kalıcı oldu
		
		obj1.add();
		
		
        // deneme() method'unu main method icinden cagirabilir miyiz? 
		// deneme();HAYIR cunku main method static, deneme() methodu degil, bu yuzden cagrilamaz
		// Bunun yerine icinde oldugumuz class' dan bir obje uretip onun uzerinden 
		// static olmayan method'lari cagirabilirz
		
		Encapsulation01 obj3= new Encapsulation01();
		obj3.deneme();
	}
	
	public void deneme() {
		// Projemiz kapsaminda bulunan tum Class'lardan
		// public variable ve method'lara istedigim yerden obje ureterek ulasabilirim
		// eger ulasmak istedigim class uyeleri(class member) public degilse baska
		// package'lerden ulasmak icin extra islem yapmamız lazim
		
		Scope1 obj2= new Scope1();
		obj2.isim="Ahmet";
		obj2.soyisim="ozcelik";
		obj2.method();
	}
}

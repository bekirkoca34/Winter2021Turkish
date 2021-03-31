package day52_re_inheritance;

public class Runner {
	
	
	/*
	 1) Java 'da class'lar arasinda parent-child relationship vardir.
	 2) Parent class' a "super class"' da denir.
	    Child class' a  "sub-class" da denir.
	 3) Ortak ozellikler parent class'a, spesific ozellikler child class' a yazilir.
	 4) Parent - Child relationship "reusability", "maintance", "less code", well organization" acilarindan faydalidir
	 5) Child classlar parent'lardaki her methodu ve variable i kullanabilirler 
	    ama parent class child class' dakileri kullanamaz.
	    
	  6) java "multiple-inheritance"' i desteklemez yani Java ' da bir Child Class'in bir tane parent'i olur
	  7) Bir parent birden fazla child class ile olusturulan relationship' e "Hierarchical Inheritance" denir.
	  8) Child - Parent -Grandparent... seklindeki relationship' e "multi-level relationship" denir
	  9) Object Class butun classlarin parent classidir.
	     Java ' da parent class'i olmayan tek class "Object Class"'dir. 
	 */
	

	public static void main(String[] args) {
		
		Animal a1=new Animal();
		a1.hareket();
		a1.yeme();
		a1.icme();
		
		System.out.println("=========================================");
		
		Mammal m1= new Mammal();
		m1.dogum();
		m1.hareket();
		m1.icme();
		m1.sutIleBesle();
		
		System.out.println("=============================================");
		
		Cat c1=new Cat();
		c1.miyav();
		c1.dogum();
		c1.hareket();
		c1.icme();
		c1.sutIleBesle();
		c1.yeme();
		
		
		
		System.out.println("==========================================");
		
		Dog d1=new Dog();
		d1.havla();
		d1.dogum();
		d1.hareket();
		d1.sutIleBesle();
		d1.yeme();
		d1.icme();
		
		System.out.println("====================================");
		
		Fish f1=new Fish();
		f1.icme();
		f1.hareket();
		f1.yumurta();
		f1.yeme();
		
		
		
		
		

	}

}

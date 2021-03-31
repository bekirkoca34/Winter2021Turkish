package day52_re_inheritance;

public class Mammal extends Animal {
	
	
	public Mammal() {
		System.out.println("Mammal parametresiz constructor");
		
	}
	
	
	public void sutIleBesle() {
		System.out.println("yavrularini sut ile beslerler");
	}
     
	public void dogum() {
		System.out.println("dogum yaparlar");
	}
}

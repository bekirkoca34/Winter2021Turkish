package day21_scope;

public class Scope4 {

	public static void main(String[] args) {
		
		int sayi=10;
		// 1 - bir method icinde olusturulan variable, sadece o method icinde kullanilabilir
		// 1 - System.out.println(isim);
		
		int sayi2;// 2- bir local variable deger atanmadanda olustulabilir.
		// System.out.println(sayi2);// 2 ancak ilk deger atamasi yapilmayan variable'lar kullanilamaz
        // sayi2++;  2 - ilk deger atanmadigi icin artirma yada azaltma da yapamayiz.
		// 2- Java deger atamasi olmadan local variable olusturulmasina izin verir,ilerrde deger atanacak diye bekler
		sayi2=15; // 2- olusturma ayri satırda (13.satirda),deger atamasi ayri satirda (15.satirda) yapilabilir.
		
		// 3- birden fazala method'un oldugu class larda her method'da kullanmamiz gereken
		// 3 - ortak variable'lar varsa class level'da variable olusturmaliyiz
		// 3- ortak variable class'in yapisina bagli olarak instance veya static olabilir.
	}
	public static void staticMethod() {
		String isim="Hasan";
	   // 1- System.out.println(sayi); bu kurala main method icerisinde olusturulan variable'larda dahildir.
	}

	public void method() {
		
		boolean isTrue=true;
		
	}
	
}

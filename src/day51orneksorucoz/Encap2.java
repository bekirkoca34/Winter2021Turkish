package day51orneksorucoz;

public class Encap2 {

	public static void main(String[] args) {
		
		Encap1 obj1=new Encap1();
		System.out.println(obj1.getAge()); // 25 get() methodu ile okuma yaptik
		
		System.out.println(obj1.getName());// Ali
		
		obj1.setAge(33); // set() methodu ile bu class da bir degisiklik yaptık. asil deger ayni
		System.out.println(obj1.getAge());// 33 Orjinal degerimiz 25 olarak kaldı, bu degismez
		
		obj1.setName("Ayse");
		System.out.println(obj1.getName());// Ayse
		
		Encap3 obj3=new Encap3();
		// num= 38 yazdiralim,
		
		obj3.setNum(38);
		System.out.println(obj3.getNum());//38
		
		// name yazdirin		
		System.out.println(obj3.getName());// Emine
		
		// Initial variable'ini degistirilemez hale getrin
		// setInitial() methodunu Encap3 class'indan sildim veya yoruma aldım
		
	
		
		
		
		
		
		
		
		
		

	}

}

package day25_arrays;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {
		// Array(Dizi): Java da 

		
		int arr[]= {10,23,54};// length=3,
		String isimler[]= new String[4]; // length=4 olan bos bir array olusturur.
		
		// Array' de primitive veya non-primitive datalarin referanslari store edilebilir
		// mesala isimlerin array'lerin icinde isim degerleri degil, isimlerin referanslari olur.
		
        // array'in elemanlarina ulasma ve update etme,
		System.out.println(isimler[1]);
		isimler[2]="Boss";
		isimler[0]="Elveda";
		
		// Array'in tum elemanlarini yazdirma
		System.out.println(Arrays.toString(isimler)); // [Elveda, null, Boss, null]
		
		// method kullanmadan tum elemanlari yazdirelim
		// loop kullanmamız lazım,
		for (int i = 0; i < isimler.length; i++) {
			 System.out.println(isimler[i] + " ");
			
		}
		System.out.println();
		System.out.println(arr);// referans yazar,
		System.out.println(Arrays.toString(arr));
	}

}

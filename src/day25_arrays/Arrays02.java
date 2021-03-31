package day25_arrays;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {
		// verilen bir array de bir elemanin var olup olmadigini nasil kontrol ederiz
		
		int arr[]= {10,25,3,16,75};
		
		int sayi=3;
		
		boolean flag=false;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==sayi) {
				flag=true;
			}
		}
		
		if (flag) {
			System.out.println("array sorulan elemani iceriyor");
		} else {
           System.out.println("array sorulan elemani icermiyor");
		}
		
		// Arrays class'indan method kullanrak yapalım,
		Arrays.sort(arr);// bu kod sıralama yapti
		System.out.println(Arrays.binarySearch(arr, sayi));// sonuc olarak sayinin indexini verdi
		System.out.println(Arrays.binarySearch(arr, 5));//  -2  bu sayi yok ama olsaydi 2. sayi olurdu anlamina gelir
		System.out.println(Arrays.binarySearch(arr, 28));// -5 bu sayi yok ama olsaydi 5. sayi olurdu
		
		// binary search sonuc olarak aradigimiz eleman varsa indexini verir.
		// aradigimiz  eleman yoksa - isareti ile olsaydı kacıncı eleman olacgini dondurur.
		
		
		int arr2[]= {12,15,25,14,3,12,65};
		
		Arrays.sort(arr2);//[3,12,12,14,15,25,65]
		System.out.println(Arrays.binarySearch(arr2, 14));// 3
		System.out.println(Arrays.binarySearch(arr2, 20));// -6
		System.out.println(Arrays.binarySearch(arr2, 12));//1
		
		// Array nasil String'e cevrilir
		
		String arrayString=Arrays.toString(arr2);
		System.out.println(arrayString);
		System.out.println(arrayString.substring(5));// bastaki [dahil tum arrayi string cevirir]
		
		
		
				
		}
		
		
		
	

}


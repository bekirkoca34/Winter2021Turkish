package day24_arrays;

import java.util.Arrays;

public class Arrays01 {
	
    public static void main(String[] args) {
	
	
    	int sayi=10;
    	int sayi2=20;
    	int sayi3=30;
    	String isim="Ali";
    	
    	 // Java 'da birden fazla elamani koyabilecegimiz (store) object'ker vardir.
    	// 
    	
    	int arr[] = {10,20,30}; // int[] arr seklinde de kullrnililabilir
    	                        // Bu orenkte Array'in elemanlarini direkt yazdigimiz icin 
    	                        // uzunluk belirtmeye ihtiyac kalmadi
    	                        // Bu kullanimda max eleman sayisi (length) yazdigimiz eleman sayisidir.
    	
    	System.out.println(arr);// Array bir object'dir.
    	                        // Eger direk olarak Array ' yazdirmak isteersek
    	
    	System.out.println(Arrays.toString(arr));//[10, 20, 30]
	
    	String takim[]= new String[5];//[null, null, null]
    	System.out.println(Arrays.toString(takim));
    	
    	takim[0]="Ali";
    	System.out.println(Arrays.toString(takim));//[Ali, null, null]
    	
    	takim[2]="Hasan";
    	takim[1]="Veli";
    	System.out.println(Arrays.toString(takim));//[Ali, Veli, Hasan]
    	
    	//takim[3]="Mehmet";// Java Run Time programdir. dolaysiyla array calistirinca olusturur
    	                  // 36. satirda syntax olarak hata olmadigindan CTE olmaz
    	                  // program calistiginda RTE verir
    	// Array daki bir elemani update etme
    	// Veli nin yerine Kemal olsun
    	takim[1]="Kemal";
    	System.out.println(Arrays.toString(takim));
    	
    	// Bir Array in uzulugunu nasil bulabliriz
    	System.out.println(takim.length);// 3
    	                                 // String deki length() idi, Array' de ise length
    	
    	// Array deki son elemani Mehmet yapin
    	takim[takim.length-1]="Mehmet";
    	System.out.println(Arrays.toString(takim));
    	
    	// Eger array'in eleman sayisi tek ise ortadaki elemani Can yapalim
    	
    	if (takim.length%2==1) {
			int ortaIndex=(takim.length-1)/2;
			takim[ortaIndex]="Can";
		}
    	
    	
    	System.out.println(Arrays.toString(takim));
    	
    	
	
}
}

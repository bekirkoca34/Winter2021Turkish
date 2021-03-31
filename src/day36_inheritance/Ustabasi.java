package day36_inheritance;

import java.util.ArrayList;
import java.util.List;

public class Ustabasi extends Isci {
	
	public String bolum="takimhane";
	public int sorOldIsciSay=20;

	public static void main(String[] args) {
		
		Ustabasi ub1=new Ustabasi();
	    // Objeyi torun classinda olusturunca 3 class' ada ulasabiliyoruz	
	
		System.out.println(ub1.bolum);// takimhane
		System.out.println(ub1.sorOldIsciSay);// 20
		System.out.println(ub1.saatUcreti);// 10
		System.out.println(ub1.isim);   //  Mehmet
		
		//List<String> list=new ArrayList<>(); bilgi yazdık, ornek kalsini diye 
		//Object str= new String("Hasan");
		
		
		Isci ub2=new Ustabasi();
		// Extends ile birbirine bagli olan class'larda IS-A relationship olan
		// data turleri istege bagli olarak kullanilabilir..(Avantaj)
		// kapsamin genis olmasi avantaji
		// kapsamin genis olmasi,
		// kapsamin olmasinin dezavantaji:
		// data turu olrak sectigimiz class ve parent(larina) ait datalara ulasabiliriz
		
		System.out.println(ub2.depatman);// Isci
		System.out.println(ub2.izindeMi);// Personel
		
		
		Personel ub3=new Ustabasi();
		System.out.println(ub3.id);// Personel
		

	}

}

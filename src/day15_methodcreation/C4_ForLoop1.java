package day15_methodcreation;

public class C4_ForLoop1 {

	public static void main(String[] args) {
		// 5 defa hello world yazdirlalim
		/*
		 * 
		 * System.out.println("Hello Word"); System.out.println("Hello Word");
		 * System.out.println("Hello Word"); System.out.println("Hello Word");
		 * System.out.println("Hello Word");
		 */

		// Bunun yerine loop kullaniyoruz
		// ne yapacagimizi Java ya soyle, java yapar

		// Tum loop 'larda 3 seyi yazmak zorundayiz
		// 1) baslangic degeri
		// 2) bitis degeri
		// 3) artis degeri

		for (byte i = 10; i > 3; i--) {
			System.out.println(i + " Hello Word");
		}

		// Not : Eger sart kismi bizim artisimiza gore hep true verirse loop sonsuz
		// donguye girer
		// Not : Loop' da artis degeri pozitf oldugu gibi negatif de olabilir, i---
		// Not : Artis degeri 1 olmak zorunda degil, farkli da olabilir
		// Not : Eger Loop Un sarti hic true olmazsa loop body devreye girmez

	}

}

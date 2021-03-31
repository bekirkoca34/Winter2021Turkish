package day18_whileLoop;

public class C2_WhileLoop1 {

	public static void main(String[] args) {
		// While : "oldugu surece" anlamina gelir.
		// 10 dan ^0 kadar olan sayilardan 4 ile bolunebilenleri
		// aralarinda bir bosluk olacak sekilde yazdirin
		
		for (int i = 10; i < 30; i++) {
			if(i%4==0) {
				System.out.print(i + " ");
			}
		}
		
		// aynisi while loop ile yapma
		
		int sayi= 10; // 1.sart (Baslangic degeri)
		
		while(sayi<30) {  // 2.sart (Bitis kosulu)
			 
			if(sayi%4==0) {
				System.out.print(sayi + " ");
			sayi++;       // 3.sart(degisim) 
		}
		
		

	}

}
	}

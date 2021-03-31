package day02_scanner;

import java.util.Scanner;

public class C1_Scanner {

	public static void main(String[] args) {
		
		//scanner ile kullanıcadan bilgi alabilirz
		//3 adımla scanner ile işleminiz gerçekleştirebilirz
		
		//1. adım Scanner oluşturacağız
		
		Scanner scan = new Scanner(System.in);
		
		// new: Java da ne zaman new kelimesini görseniz yeni bir object oluşturuluyor demektir.
		// parantez içnine yazılan değerlere parametre denir. System.in yazmamız gerek
		//jva.util java nın bizim için hazırladığı bir kutuphanedir.
		
		
		
		
		// 2. adım kullanıcıya bir mesaj yazın
		
		System.out.println("Karenin bir kenar uzunluğunu girin");
		
		// 3. adım kullanıcının konsola girdiği değeri programımıza alacağız
		//ve bir variable olusturup bu değeri atayacagız
		// kullanıcı buyuk sayıda, kucukte, virgüllu de girebilir,,,,
		
		double kenar=scan.nextDouble();
		
		System.out.println("Karenin alanı="+kenar*kenar);
		
		
		
		
		

	}

}

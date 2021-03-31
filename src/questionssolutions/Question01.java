package questionssolutions;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {

		/*
		 * Kullaniciya gunde kac cay ictigini ve cayi kac sekerli ictigini sorun. Daha
		 * sonra kullanicinin yilda kac kg seker kullandigini hesaplayan java kodunu
		 * yaziniz. 
		 * 1 seker= 1.7 gr Ornek: Input ⇒ Cay : 10 Seker :2 Output : 12.41
		 * kg/yil
		 */

		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir gunde kac bardak cay ictiginizi giriniz");
		int tea=scan.nextInt();
		System.out.println("Lutfen bir bardak icin kac gram seker kullandıgınızı giriniz");
		double sugar=scan.nextDouble();
		
		System.out.println("Bir yilda tuketilen cay miktari : " + tea*sugar*30*12/1000+ " kg/yil");
		
		
		
	}
	


}

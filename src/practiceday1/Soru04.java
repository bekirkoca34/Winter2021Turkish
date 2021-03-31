package practiceday1;

import java.util.Scanner;

public class Soru04 {

	public static void main(String[] args) {
		// 
		/*
		
		kulluykuda gectigini anicidan gunde kac saat uyudugunu sorun,
		==> ayda yilda ve 40 yilda kac gunun uyur
		
		
		
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen gunde kac saat uyudugunuzu giriniz");
		
	     float uyku= scan.nextFloat();
	     
	     float ay=(uyku*30)/24f;
	     float yil=(uyku*365)/24f;
	     float kirkyil= yil*40f;
	     
	     System.out.println("Bir ayda uykuda gecen gun sayisi" + ay);
	     System.out.println("Bir yilda uykuda gecen gun sayisi" + yil);
	     System.out.println("Kirk yilda gecen gun sayisi" + kirkyil);
		
		
		
		

	}

}

package practiceday1;

import java.util.Scanner;

public class Task_2 {

	public static void main(String[] args) {
		/* Soru 2: Kullanicidan Y/N ikilisinden birisini girdiginde girdigi degeri
		 * ekrana yazdiran java kodunu yaziniz.
		 * INPUT : Y
		 * 	OUTPUT : YES
		*/
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen Y/N ikilisinden birisini giriniz");
		
		char input=scan.next().charAt(0);
		if(input=='y' || input=='Y') {
			System.out.println("Yes");
		}else if(input=='n' || input=='N'){
			System.out.println("No");
		}else {
			System.out.println("Lutfen tekar komut giriniz");
		}
		
		scan.close();
		
		
		
		
		

	}

}

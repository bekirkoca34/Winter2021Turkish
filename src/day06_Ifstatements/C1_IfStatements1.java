package day06_Ifstatements;

public class C1_IfStatements1 {

	public static void main(String[] args) {
		// 
		
		int a= 10;
		int b=  8;
		
		if (a>b) {
			System.out.println("ilk sayi buyuk");
			
		}
		
		if (a*b<0) {
			System.out.println("sayilarin carpimi negatif");// false olduğundan bişey yazmaz
		}
		
		
		if (a<b || b>0) {
			
			System.out.println("or'lu cumle calisti");// 
		}
		
		if (a-b>0 && a*b>0) {
			System.out.println("and cumlesi calisti");
		}
		
		
		
		
		
		

	}

}

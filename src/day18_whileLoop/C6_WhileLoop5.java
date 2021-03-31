package day18_whileLoop;

public class C6_WhileLoop5 {

	public static void main(String[] args) {
		// verilen sayinin asal olup olmadigini bulan bir program yaziniz
		
		// 1 ve kendisi disinda hic bir pozitif tamsayiya kalansız blunmeyen
		
	
		
		int sayi=13;
				
		
		String flag="Asal";
		
		int bolen=2;
		while(bolen<sayi) {
			
			if (sayi%bolen==0) {
				flag="Asal sayi degil";
				
			}
			
			bolen++;
		}
		
		System.out.println(flag);
		
		
		
		

	}

}

package day34_inharitance;

public class Muhasebe extends Personel {
   // muhasebe class'in personel class' in child class' i oldugunu 
	// declare etmek icin class ismine extends keyword ile
	// parent class' i yazariz
	
	public int saatUcreti;
	public String statu;
	public int maas;
	
	
	public int maasHesapla() {
		
		maas=30*8*saatUcreti;
		return maas;
	}
	
	
	
	
	
	

}

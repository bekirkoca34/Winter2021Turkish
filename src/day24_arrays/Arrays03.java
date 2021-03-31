package day24_arrays;

public class Arrays03 {

	public static void main(String[] args) {
		// Soru 2: Verilen bir array’in tum elemanlarini toplayan bir program yazalim.
		
		
		
		int arr[]= {10,15,2,45,78};
		
		int toplam=0;
		for (int i = 0; i < arr.length; i++) {
			
			toplam+=arr[i];
			
		}
         System.out.println(toplam);
         
         
         // verilen arrayİn tum elemanlarini toString methodu olamdan ve aralarinda bir boslukla yzdirin
         
         
         for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
         
         
         
	}

}

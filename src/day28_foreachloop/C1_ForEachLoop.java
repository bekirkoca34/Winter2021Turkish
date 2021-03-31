package day28_foreachloop;

public class C1_ForEachLoop {

	public static void main(String[] args) {
		// bir array'in tum elemanlarini for loop ile yazdirilalim
		
		 int arr[]= {2,4,6,8,10,12};
		
		for (int i = 0; i < arr.length; i++) {// asıl amac array 'in tum elemanlarını loop'a getirmek
			System.out.print(arr[i]+ " ");
			
		}
			// for loop yazmamızın amacı arrayin TUM ELEMANLARI uzerinde islem yapmak ise;
			// foreach loop kod yazmamizi saglar
			
			// for each loop istedigim bir topluluktaki tum elemalari birer birer bana getrir
			// for each loop da baslangıc degeri YOKTUR, bitis degeri YOKTUR, index YOKTUR
			System.out.println();
			
		  
			
		}

	}



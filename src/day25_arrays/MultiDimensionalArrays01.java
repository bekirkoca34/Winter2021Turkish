package day25_arrays;

import java.util.Arrays;

public class MultiDimensionalArrays01 {

	public static void main(String[] args) {
		/* 1- ic ice array olusturdugumuzda disaridaki ana array e outer array, icerdeki kucuklere inner array denir
		
		   2- Eger icerdeki array'lerin boyutlari birbirinden farkli farkli ise array'i 
		   ancak tum elemanlari yazarak declare edebilirz
		   
		    3 - multi dimensinal array' de bir elemanin indexi icin en disdaki array haric, elemana kadar 
		    ic ice olan tum arraylerin indexlerini yazmak gerekir
		
				
        */
		
		int arr[][]= {{1,3,5}, {3,5},{5,9,11,3}};// iki katli array'dir
		
		//11' i index ile ifade etmek istersek arr[2][2]
		// eger Array'i uzunlukla declare etmek isteresek innar array uzunluklari esit olmali,
		
		int arr2[][]=new int [3][2];
		//[3] ilk yazilan sayi outer arrayin icinde kac tane inner oldugunu belirtir.
		//[2] her bir inner array'in uzunlugu 
		
		System.out.println(Arrays.toString(arr2));
		
		//Multidimensioanal array'leri yazdirmak icin toString methodu kullanilamaz
		// cunku to String methodu outer array'i String' e cevirir
		// outer array'in icinde inner array'ler oldugundan toString method'unda inner arraylerin
		// referans degerleri yazdirilir.
		
		System.out.println(Arrays.deepToString(arr2));
		
		
		
	}

}

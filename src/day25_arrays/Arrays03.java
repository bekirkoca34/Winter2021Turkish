package day25_arrays;

import java.util.Arrays;

public class Arrays03 {

	public static void main(String[] args) {
		// verieln bir String i array' e nasil cevirirz
		// verilen bir cumlede kac kelime oldugunu bulunuz
		// verilen cumlede her kelimenin ilk harfini buyuk yapainiz
		
		String str="Herkes Javayi tanisa severdi";
		// bu Stringi kelimelere ayiralim
		// split methodu
		
		String arr[]=str.split(" ");
		System.out.println(Arrays.toString(arr));
		
		String arr2[]=str.split("Java");
		System.out.println(Arrays.toString(arr2));
		
		String arr3[]=str.split("a");
		System.out.println(Arrays.toString(arr3));
		
		String arr4[]=str.split("");// hiclik,,, harflere parcaladi
		System.out.println(Arrays.toString(arr4));
		
		

	}

}

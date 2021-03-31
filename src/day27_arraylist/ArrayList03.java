package day27_arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList03 {

	public static void main(String[] args) {
		// Kullanicidan pozitif bir tamsayi alin
		// aldiginiz sayidan kucuk olan fibonacci dizisi elamlarini yazdirin
		// 1 1 2 3 5 8 13 21 34 ...
		

		Scanner scan= new Scanner(System.in);
		System.out.println("lutfen pozitif bir tamsayi giriniz");
	    int sayi= scan.nextInt();
	    
	    List<Integer> fibo= new ArrayList<>();
	    fibo.add(1);
	    fibo.add(1);
	    
	    System.out.println(fibo);// [1, 1]
	    
	    System.out.println(fibo.get(0)+ fibo.get(1)); // 2 
	    
	    int count=2;
	    for(int i=2; fibo.get(i-2) + fibo.get(i-1)< sayi; i++) {
	    	fibo.add(fibo.get(i-2) + fibo.get(i-1));
	    	count++;
	    }
	    System.out.println(fibo);
	    System.out.println(count);
	    
	    //  kac tane sayı oldugunu bulmak icinde for loop da, count++  ile yapabilir miyiz
	    
	    
	    
	    
		
	}

}

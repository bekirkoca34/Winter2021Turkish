package day60_javahomework;

import java.util.Date;

import java.text.DateFormat;

import java.text.SimpleDateFormat;

import java.util.Scanner;
public class HomeWork3_Question3 {

	public static void main(String[] args) {
		/*
		 * “NestedIfStatements” class olusturun. Kullanicidan 2 kisi icin dogum gunu
		 * girmesini isteyin. Yılı, ayi ve günü tamsayı olarak alın e NestedIf
		 * kullanarak kimin yas olarak daha buyuk oldugunu ekrana yazdirin. Examples:
		 * int birthYearOfYusuf=2000, birthMonthOfYusuf=12, birthDayOfYusuf=12, int
		 * birthYearOfMehmet=2000,birthMonthOfMehmet=12, birthDayOfMehmet=21; Yusuf is
		 * Older
		 */
		

	        Scanner scan = new Scanner(System.in);

	        Date zaman = new Date();

	        System.out.println(zaman.toString());

	        DateFormat sD = new SimpleDateFormat("dd");

	        DateFormat sM = new SimpleDateFormat("MM"); // mm yapınca olmuyor MM olması gerek

	        DateFormat sY = new SimpleDateFormat("yyyy");

	        int x = Integer.parseInt(sD.format(zaman));

	        int y = Integer.parseInt(sM.format(zaman));

	        int z = Integer.parseInt(sY.format(zaman));

	        System.out.println("Hoşgeldiniz. Sırasıyla önce gün sonra ay ve sonra yıl olacak"

	                + " şekilde doğum tarihini giriniz:");

	        int a = scan.nextInt();

	        int b = scan.nextInt();

	        int c = scan.nextInt();

	        int gun, ay, yil;

	        if(x<a){

	            gun = x - a +30;

	            --y;

	        }

	        else

	            gun = x - a;

	        if(y<b){

	            ay = y - b +12;

	            --z;

	        }

	        else

	            ay = y - b;

	        yil = z - c; 

	        System.out.println("Yas = "+yil);

	        System.out.println("Tam yas = "+gun+"/"+ay+"/"+yil);

	}

}

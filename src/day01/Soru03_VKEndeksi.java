package day01;

import java.util.Scanner;

public class Soru03_VKEndeksi {

	public static void main(String[] args) {
		
		/*
		 * Kullanicidan boyunu cm olarak alin, kilosunu kilogram olarak alin
		 * ve vucut kutleendeksini bulun
		 * sonucu tam sayi ve ondalikli sayi olarak yazdirin
		 * Vucut kilo endeksi = kilo/boy*boy -----> kilo : kg , boy : metre olmalidir
		 * 
		 * */
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Lutfen boyunuzu m olarak giriniz");
		
		double boy = scan.nextDouble();
		
		
		System.out.println("Lutfen kilonuzu kg degeri olarak yaziniz");
		
		double kilo = scan.nextDouble();
		
		double result = kilo/(boy*boy) ; 
		
	//	int result2 = kilo/(boy*boy);
		
		System.out.println("Vucut kutle endeksiniz:" + result);
	//	System.out.println("VKE tam sayi olarak :" + result2);
		
		scan.close();
		
	}

}

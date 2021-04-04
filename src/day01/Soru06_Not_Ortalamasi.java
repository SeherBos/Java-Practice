package day01;

import java.util.Scanner;

public class Soru06_Not_Ortalamasi {

	public static void main(String[] args) {
		
		/*
		 * Kullanicidan ara notu, final notu ve proje notu isteyin
		 * genel notu hesaplayin ( ara sinav:%30 , final sinav :%50 , proje notu:%20 )
		 *
		 * */

		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Vize notunuzu giriniz.");
		
		double vizeNot= scan.nextDouble();
		
		System.out.println("Final notunuzu giriniz");
		
		double finalNot = scan.nextDouble();
		
		System.out.println("Proje notunuzu giriniz");
		
		double projeNot = scan.nextDouble();
		
		double genelNot = (vizeNot*30/100) + (finalNot/2) + (projeNot*0.2);
		
		// bir sayinin yuzdesini almak icin ya yuzde ile carpip ardindan 100 ile bolebilirsin 
		
		// yada alacagimiz yuzde sayisini direkt virgullu sayiya cevirip, not ile carpabiliriz.
		
		// final sinavi : finalNot/2 : %50'sini alir  ve ya finalNot*0.5 olarak yazilabilir.
		
		System.out.println("Genel notunuz: " + genelNot);
		
		
		scan.close();
		
	}

}

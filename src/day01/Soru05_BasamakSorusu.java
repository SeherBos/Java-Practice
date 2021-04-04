package day01;

import java.util.Scanner;

public class Soru05_BasamakSorusu {

	public static void main(String[] args) {

		/* kullanicinin girdigi 4 rakamli sayinin  rakamlari toplamini veren program yazdirin
		 * 
		 * */
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("4 basamakli bir sayi giriniz");
		
		int rakam = scan.nextInt();
		
		int binlerBas = rakam/1000;
		int yuzlerBas = (rakam/100)%10;
		int onlarBas = (rakam/10)%10;
		int birlerBas = rakam%10;
		System.out.println("Girilen sayibasamaklari toplami : " +  (binlerBas+ yuzlerBas+onlarBas+birlerBas));
		 
		
		
		scan.close();
		
		
	}

}

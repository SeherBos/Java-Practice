package day01;

import java.util.Scanner;

public class Soru07_Dort_Islem {

	public static void main(String[] args) {
		
		/*
		 * Kullanicidan iki sayi girmesini isteyin
		 * Kullaniciya dort islem menusunu gosterin ve birini secmelerini isteyin.
		 * Kullanicinin secimine gore girilen sayilarin islem sonucunu yazdirin.
		 * 
		 * */
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Lutfen birinci sayi giriniz");
		
		double sayi1 = scan.nextDouble();
		
		System.out.println("Lutfen ikinci sayi giriniz");

		double sayi2 = scan.nextDouble();
		
		System.out.println("Lutfen dort islemden birini seciniz \n1. Toplama \n2. Cikarma \n3. Carpma \n4. Bolme ");
		
		byte secim = scan.nextByte();
		

		
		if (secim==1) {
			System.out.println("Girilen sayilar toplami : " + (sayi1+sayi2));
			
			
		} else if(secim==2){
			System.out.println("Girilen sayilar farki : " + (sayi1-sayi2)); 
				
			} else if (secim==3){
				
				System.out.println("Girilen sayilar carpimi : " + (sayi1*sayi2));
					
				} else if (secim==4) {
					
					System.out.println("Girilen sayilar bolumu : " + (sayi1/sayi2));

				} else {
					
					System.out.println("Yanlis giris yaptiniz");

				}

				
			
			scan.close();

			
			
			
		}
		
	
	}



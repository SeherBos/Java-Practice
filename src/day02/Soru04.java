package day02;

import java.util.Scanner;

public class Soru04 {

	public static void main(String[] args) {

		/*Kullanıcı tarafından girilen bir sayının
		 *mutlak değerini yazdırmak için bir program yazın.
		 */
		
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Mutlak deger bulmak icin bir sayi giriniz");
		
		int sayi = scan.nextInt();
		
		if (sayi>=0) {
			System.out.println("Girilen sayinin mutlak degeri : "+ sayi);
		} else {
			System.out.println("Girilen sayinin mutlak degeri : "+ (sayi*-1));

		}
		
		scan.close();
		
	}

}

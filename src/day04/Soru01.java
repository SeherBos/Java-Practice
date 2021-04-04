package day04;

import java.util.Scanner;

public class Soru01 {

	public static void main(String[] args) {
		
		/* Kulanicidan alina bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
		 * return eden metod yaziniz
		 *
		 * ornek
		 * input  elma  2
		 *        army  3
		 *
		 * output  eaea
		 *         ayayay
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir kelime giriniz");
		
		String str1 = scan.nextLine().toLowerCase();
		
		System.out.println("tekrar sayisini giriniz");
		
		int tekrarSayi = scan.nextInt();
		
		
		System.out.println(strMethod1(str1, tekrarSayi));
		
		scan.close();
	}

	public static String strMethod1(String str , int n) {
		
		
		 String s = str.substring(0,1) + str.substring(str.length()-1);
		 
			String b = "";

		
		for (int i = 1; i <= n ; i++) {
			

			b = b+s;
			
		} 
		
		
		
		
		return b;
	}

}

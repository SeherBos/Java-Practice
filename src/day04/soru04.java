package day04;

import java.util.Scanner;

public class soru04 {

	public static void main(String[] args) {

	/*	Bir Stringin tersten ayni olup olmadigini bulunuz.  (Palindrom)
		 *
		 * ornek
		 *  madam , nurses run  ==> palindromdur
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir dizi giriniz");
		
		String str1 = scan.nextLine().replace(" ", "").toLowerCase();
		
		
		palindrom (str1);
		
	scan.close();
			
		}
		public static void palindrom (String str) {
			
			String strTers= "";
			for (int i = str.length()-1 ; i>=0; i--){
				strTers = strTers + str.charAt(i);
			}
			System.out.println("Girilen kelimenin tersi: " + strTers);
			if (strTers.equals(str)) {
				System.out.println("Girilen kelime palindromdur.");
			}else {
				System.out.println("Girilen kelime palindrom degildir.");

			}
		}
		
	}



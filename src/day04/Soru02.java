package day04;

import java.util.Scanner;

public class Soru02 {

	public static void main(String[] args) {
	/*	girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
				 *
				 * input      output
				 * axyzm  ==   true
				 * xyz    ==   true
				 * x.yz   ==   false
				 * xyaz   ==   false
*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir kelime giriniz");
		
		String str = scan.nextLine().toLowerCase();
		
		
		System.out.println(kelime(str));
		
		scan.close();
		
	}
	public static boolean kelime(String str) {
		
	if (str.contains("xyz")) {
		return true;
	} else {
		return false;
	}
		


	}

}

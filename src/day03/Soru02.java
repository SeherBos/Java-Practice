package day03;

import java.util.Scanner;

public class Soru02 {

	public static void main(String[] args) {
		/* StringMethods
        String girildiginde ilk iki karakteri haric string return eden java programi yaziniz
        Ancak ilk karakter 'g' ve ikinci karakteri 'h' ise bu karakterler de return edilsin
       ORNEK:
        INPUT      :  goat				 	OUTPUT :    gat
                      photo								hoto
                      ghost								ghost
                      kalem								lem
                      
       
                    
                      
                      
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Bir kelime giriniz.");

		String str = scan.nextLine().toLowerCase();
		
			
		ilkIkiHaric(str);
		
		scan.close();
		}

	public static void ilkIkiHaric(String s) {
		
		if(s.startsWith("gh")) {
			System.out.println(s);
		} else if(s.startsWith("g")) {
			System.out.println((s.charAt(0))+(s.substring(2)));	
		} else if (s.charAt(1)=='h') {
			System.out.println(s.substring(1));
		} else {
			System.out.println(s.substring(2));
		}
		

		
	}

}

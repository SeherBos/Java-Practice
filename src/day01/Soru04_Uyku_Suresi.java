package day01;

import java.util.Scanner;

public class Soru04_Uyku_Suresi {

	public static void main(String[] args) {
		
		//Kullaniciya gunde kac saat uyudugunu sor 
		// ayda,yilda ve 40 yilda kac saat uyudugunu yaz.
		
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Gunde kac saat uyuyorsunuz?");
		
		float uyku = scan.nextFloat();
		
	/*	float ay = (uyku*30)/24f;
		float yil = (uyku*365)/24f;
		float kirkYil = yil*40f;
		
		
		
		
		System.out.println("Aylik uykuda gecirdiginiz gun sayisi : " + ay);
				
		System.out.println("Yilda uykuda gecirdiginiz gun sayisi : " + yil);
		
		System.out.println("40 yilda uykuda gecirdiginiz gun sayisi : " + kirkYil);
		
	*/	
		// yukarida ki float variable'larini tanimlamadan da direkt asagida ki sekilde print yapilabilir.
		
		System.out.println("Aylik uykuda gecirdiginiz gun sayisi : " + (uyku*30)/24f);
				
		System.out.println("Yilda uykuda gecirdiginiz gun sayisi : " + (uyku*365)/24f);
		
		System.out.println("40 yilda uykuda gecirdiginiz gun sayisi : " + ((uyku*365)/24)*40f);	 // islem onceligine dikkat et burada
		
		
		
		
		scan.close();
		
		
	}

}

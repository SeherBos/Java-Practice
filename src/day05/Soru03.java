package day05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soru03 {

	public static void main(String[] args) {
		/* Kullanicidan int  list uzunlugunu isteyin
		 * Listin uzunlugu kadar kullanicidan list elemanlarini girmesini isteyin
		 * Tekrarli list elemanlarindan yeni bir list olusturan ve  yazdiran metod yazin
		 */
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Olusturmak istediginiz listin uzunlugunu giriniz");
		int listLenght = scan.nextInt();
		
		List <Integer> list = new ArrayList<>();
		
		System.out.println("girdiginiz listin uzunlugu kadar list elemani ekleyiniz");
		
		for(int i = 0 ; i < listLenght ; i++) {
			list.add(scan.nextInt());
		}
		
		tekrarliEleman(list);
		
		scan.close();
		
		
	}
	
	public static void tekrarliEleman(List<Integer> liste) {
		
		List <Integer> tekrarliList = new ArrayList<>();
		
		for(int i = 0 ; i <liste.size() ; i++) {
			for(int j = i + 1 ; j < liste.size() ; j++) {
				if(liste.get(i) == liste.get(j) && !tekrarliList.contains(liste.get(i)) ) {
					tekrarliList.add(liste.get(i));
				}
			}
		}
		
		System.out.println("tekrarli listin elemanlari : " + tekrarliList);
		
		
		
		

		
	}
	
}

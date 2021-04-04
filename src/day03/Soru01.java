package day03;


public class Soru01 {

	public static void main(String[] args) {
/*
 * Ternary kullanarak bir kod yazin. fiyat isminde bir variable tanimlayin. eger fiyat
 * 10 dan az ise "ucuz" , 10 ile 20 arasinda ise "normal" , 20 ve 20 den buyuk ise pahali olsun
 * 
 * */
		
		
		int fiyat = -7;
		
		
		String sonuc = (fiyat>=1 && fiyat<10) ? "Ucuz" : fiyat<20 ? "normal" :
																	 "pahali";
		
		System.out.println(sonuc);
		
		
	}
	
}

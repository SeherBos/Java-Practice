package day02;


public class Soru02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Auto widening ve Explicit narrowing ornekleri olusturunuz increment ve
		 * decrement ornekleri olusturunuz iki variable olusturun ve matematik
		 * operatorlerini kullanarak dort islem ve mod islemlerini yapiniz
		 */
		System.out.println("________Auto Widening______");

		// AutoWidening
		int a = 30;
		System.out.println(a);
		double b = a;
		System.out.println(b);

		System.out.println("_______Explicit Narrowing______");

		// Explicit Narrowing
		double c = 45.6;
		;
		System.out.println(c);

		int d = (int) c; // esitlik sonrasinda (parantez icini) yazmazsan hata verir
		System.out.println(d);

		System.out.println("________Increment________");

		// Increment

		int i = 20;
		System.out.println(i);

		i = i + 20;
		System.out.println(i);

		i += 20;
		System.out.println(i);

		System.out.println("_________Decrement______");

		short s = 10;
		System.out.println(s);

		s = (short) (s + 10);
		System.out.println(s);
		s -= +10;
		System.out.println(s);

		short x = 10;

		x = (short) (x = 10);

		short y = 5;

		short toplama = (short) (x + y);
		short cikartma = (short) (x - y);
		short carpma = (short) (x * y);
		short bolme = (short) (x / y);

		System.out.println("Toplama :" + toplama);
		System.out.println("Cikartma :" + cikartma);
		System.out.println("Carpma :" + carpma);
		System.out.println("Bolme :" + bolme);

		short mod = (short) (y % 6);
		System.out.println("Mod: " + mod);

	}

}

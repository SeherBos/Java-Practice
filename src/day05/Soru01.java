package day05;
import java.util.Scanner;

public class Soru01 {

	public static void main(String[] args) {
		/* Kullanicidan int array uzunlugunu isteyin
		 * Arrayin uzunlugu kadar kullanicidan array elemanlarini girmesini isteyin
		 * Array elemanlarini toplamini return eden metod yazin
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Array uzunlugunu giriniz");
		int arrLen = scan.nextInt();
		
		int arr[] = new int [arrLen];
		
		// kullanicidan array uzunlugu kadar array elemanlari girmesini isteyin
		
		System.out.println("Array elemanlarini giriniz");
		
		
		for (int i = 0; i < arrLen; i++) {
			
			arr[i] = scan.nextInt();
			
		}
		
		// 4. adim olusturulan methodun cagrilmasi
		
		System.out.println("olusturulan array elemanlari toplami:" + arrayToplami(arr));
		
		
		scan.close();
	}

	
	// 3. adim array elemanlarini toplayan method yazalim.
	
	public static int arrayToplami(int arrSum[]) {
		
		
		int sum = 0;
		
		
		for (int each : arrSum) {
			sum+=each;
			
			
			
		}
		return sum;
	}
	
}

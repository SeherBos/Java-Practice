package day05;

public class Soru02 {

	public static void main(String[] args) {

		/* Girilen Multidimensional arraydeki cift sayilari toplayan bir method
        * yaziniz
        *
        *
        * INPUT : {{1,3,6},{2,8},{5,7,9,14}}
        *
        * OUTPUT : Arraydeki cift sayilarin toplami : 30
        */
		int multiArr[][] ={{1,3,6},{2,8},{5,7,9,14}};

	
		System.out.println("Cift elemanlar toplami: " + arrayToplam(multiArr));
		
	}

	public static int arrayToplam(int arr [][]) {
		
		int toplam = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j]%2==0) {
					toplam+=arr[i][j];
					
					
				}
				
			}
		}
		
		return toplam;

	}
	
}

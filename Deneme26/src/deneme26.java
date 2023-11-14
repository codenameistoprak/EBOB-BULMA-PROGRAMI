import java.util.Scanner;

public class deneme26 {

	// İteratif olarak EBOB'u bulan fonksiyon.
	//Kullanıcıdan alınan iki sayının EBOB unu ekrana yazdıran fonksiyon
	//while döngüsü ile	   
	
	/*public static int ebobBul(int sayi1, int sayi2) {
		        while (sayi1 != sayi2) {
		            if (sayi1 > sayi2) {
		                sayi1 -= sayi2;
		            } 
		            
		            else {
		                sayi2 -= sayi1;
		            }
		        }
		        return sayi1;
		    }
 
		    public static void main(String[] args) {
		    	Scanner scanner = new Scanner(System.in);
		    	System.out.println("EBOB Hesaplama Programına Hoşgeldiniz... ");
		    	System.out.println("İki tane sayı giriniz: ");
		    	
		        int sayi1 = scanner.nextInt();
		        int sayi2 = scanner.nextInt();

		        int ebob = ebobBul(sayi1, sayi2);

		        System.out.println(sayi1 + " ve " + sayi2 + " sayılarının EBOB'u: " + ebob);
		        scanner.close();
		    }
		

*/
	public static int ebobBulma(int a,int b) {
		//for döngüsü ile
		
		int ebob=1;
	
		for(int i=1; i<=a && i<=b; i++) {
		
			if((a%i==0) && (b%i==0)) {
	    		
	    	ebob=i;
	    	}
	    	
	    }return ebob;
		}
		
					
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("EBOB BULMA PROGRAMI");
		System.out.println("İki tane sayı giriniz: ");
		int sayi = scanner.nextInt();
		int sayi1 = scanner.nextInt();
	
		System.out.println("EBOB: "+ebobBulma(sayi,sayi1));
		scanner.close();
	}
	
	
	}



package assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Diziler {

	public static void main(String[] args) {
		
//	int[] sayilar = new int[]
//		{9,8,7,6,5};
//		System.out.println("Tek Boyutlu Tablonun Elelmanları \n" );
//		for(int x=0;x<sayilar.length;x++)
//			System.out.print(sayilar[x] + " ");
//	
//	int[][] tablo = new int[][]
//		{
//			{1,2,3,4,5},
//			{6,7,8,9,10},
//			{11,12,13,14,15},
//			{16,17,18,19,20},
//			{21,22,23,24,25}
//		};		
//		System.out.println("\n\nÇift Boyutlu Tablonun Elelmanları \n" );
//		for(int y=0;y<tablo.length;y++)  
//			// tablo.length = Tablonun Sütun (Y Koordinatı) Sayısını Veriyor. 
//			{
//				for(int x=0;x<tablo[0].length;x++) 
//					// tablo[0].length = Tablonun Satır ((X Koordinatı)) Sayısını Veriyor.				
//					System.out.print(tablo[y][x] + " ");
//				System.out.println();
//			}
//		System.out.println();
//				
//		for(int[] sutun : tablo) {
//			for(int deger : sutun)
//				System.out.print(deger + " ");
//			System.out.println();
//		}
//		
//		
//		System.out.println(tablo.length);    // Tablonun Sütun (Y Koordinatı) Sayısını Veriyor. 
//		System.out.println(tablo[0].length); // Tablonun Satır (X Koordinatı) Sayısını Veriyor.
		
//		int[] dizi1 = {1,2,3,4,5};
//		System.out.println(Arrays.toString(dizi1));	
////		Dizinin Tamamını Yazdırma Komutu Arrays.toString(dizi adı);
//		dizi1[3] = 21;
//		System.out.println(Arrays.toString(dizi1));
//		boolean a1a2;
//		int a1[] = {2,4,6};
//		int a2[] = {2,4,6};
//		
//		a1a2 = (a1==a2);
//		System.out.println(a1a2);
//		String str = "Selamun Aleyküm";
//		String st [] = str.split(" ");
//		System.out.println(Arrays.toString(st));
		
		Scanner scan = new Scanner(System.in);
		
//		int toplam = 0;
		
//		for(int sayac=1;sayac<6;sayac++ )
//		{
//			System.out.println(sayac + ". Sayıyı Giriniz ");
//			int sayi = scan.nextInt();
//			toplam += sayi;
//			System.out.println("Sayınız = " + sayi);
//		}
//		System.out.println("Girdiğiniz Sayıların Toplamı = " + toplam);
//		
//		MarketUrun urunler = new MarketUrun();
//		System.out.println("Marketten 5 Adet Ürün Alma Hakkı Kazandınız \n  "
//				         + "İstediğiniz Ürünleri Giriniz ");
//		for(int i=0;i<5;i++)
//		{
//			System.out.println((i+1) + " . Ürünü Giriniz = " );
//			urunler.urun[i]= scan.nextLine();
//		}		
		
//		for(int x=1;x<7;x+=2)  
//		{
//			for(int y=0;y<7;y+=2) 
//			{ 
//				System.out.println("X = " + x + " Y = " + y); 
//				System.out.println("Merhaba");
//			}
//		}
		
		int say=0;
		int[] notlar = new int[15];
		
		for(int a=0;a<15;a++)
		{
			System.out.println((a+1) +". Notunuzu Giriniz ");
			notlar[a] = scan.nextInt();
		
		}
		
		String[] adlar1 = new String[5];
		String[] adlar =  {"Ahmed","Mehmed","Ali","Adem","Yasar"};
		
		
		
        System.out.println(Arrays.toString(notlar));

		

	       

		
		
		
	}
}

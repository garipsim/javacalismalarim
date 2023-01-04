package assignment;

import java.util.Scanner;

public class MarketUrun 
{
	static String[] urun = new String[5]; 
	
	public MarketUrun()
	{
		System.out.println("Market Listesi");
	}
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		MarketUrun urunler = new MarketUrun();
		Listele lstl = new Listele();
		
		System.out.println("Marketten 5 Adet Ürün Alma Hakkı Kazandınız \n  "
				         + "İstediğiniz Ürünleri Giriniz ");
		for(int i=0;i<5;i++)
		{
			System.out.println((i+1) + " . Ürünü Giriniz = " );
			urunler.urun[i]= scan.nextLine();
			lstl.malzeme[i] = urunler.urun[i];
		}		
		
		for(int i=0;i<5;i++)
		{
			System.out.println((i+1) + " . Ürün = " + urunler.urun[i]);
			System.out.println((i+1) + " . Ürün = " + lstl.malzeme[i]);
			
		}
	}
}

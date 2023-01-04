package assignment;

//import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Listele 
{
	static String[] malzeme = new String[5]; 
//	Arraylist<String> malzeme = new Arraylist<String>();
	public Listele() {};
	
	{  	System.out.println("Malzemeler");    }
	
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			int verim;
			Listele mal = new Listele();
			for(int i=0;i<5;i++)
			{
				System.out.println((i+1) + " . Ürünü Giriniz = " );
				mal.malzeme[i]= scan.nextLine();
			}	
			 Arrays.sort(mal.malzeme);
			for(int i=0;i<5;i++)
			{
//				System.out.println((i+1) + " . Ürün = " + MarketUrun.urun[i]);
				System.out.println((i+1) + " . Ürün = " + mal.malzeme[i]);
			}
			mal.malzeme[2]="Koltuk";
			
			verim = Arrays.binarySearch(mal.malzeme,"Koltuk");
			if(verim<0)
	            System.out.println("Arama Yaptığınız Değeri Bulamadım.");
	        else
	            System.out.println("Değişiklik Yaptığınız Ürün" + " Koltuk " + "Listeye Eklenmiştir.");
			
			for(int i=0;i<5;i++)
			{
				System.out.println((i+1) + " . Ürün = " + mal.malzeme[i]);
			}
				System.out.println(mal.malzeme);
	}
}



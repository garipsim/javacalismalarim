package assignment;

import java.util.ArrayList;

public class Dizilerim {
	
	
	
	  public static void main(String[] args) 
	  {
		 
		  int sayilar[][] = {
					{99, 37, 15, 51, 20, 78, 99, 33, 92, 41},
					{98, 93, 41, 19, 27, 93, 63, 36, 63, 28},
					{23, 20, 50, 56, 28, 79, 81, 39, 33, 49},
					{33, 36, 58, 92, 47, 32, 74, 32, 23, 26},
					{92, 88, 78, 68, 65, 81, 26, 89, 23, 54},
					{94, 61, 41, 84, 40, 79, 79, 84, 49, 21},
					{80, 76, 83, 54, 55, 57, 75, 44, 11, 26},
					{10, 35, 77, 57, 14, 79, 37, 39, 88, 23},
					{84, 32, 34, 81, 81, 53, 71, 39, 62, 39},
					{89, 45, 20, 93, 18, 90, 98, 32, 16, 17}
			};
		  
		int xtoplam;
		int ytoplam = 0;
		for(int y=0;y<10;y++)
		{	
			ytoplam = 0;
			xtoplam = 0;
			for(int x=0;x<10;x++)
			{
				xtoplam += sayilar[y][x];
				ytoplam += sayilar[x][y]; 
				
			}  
			System.out.print(" " + (y+1) + ". Satır Toplamı = " + xtoplam );
			System.out.print(" " + (y+1) + ". Sütun Toplamı = " + ytoplam);
			System.out.println();
			
		}
//		System.out.println();
//		System.out.print(ytoplam + "   ");
		
		
		
		  
//		int ytoplam=0;
//		int xtoplam=0;
//		for(int y=0;y<10;y++)
//		{
//			xtoplam=0;
//			for(int x=0;x<10;x++)
//			{
//				xtoplam += sayilar[y][x];
//			    ytoplam += sayilar[x][y];
//			}
//			System.out.print(xtoplam + "   ");
//			System.out.println();
//		System.out.println(ytoplam);
			
			
			
		
	  }
	  }




package assignment;

public class Siniflar {
	
	public static void main(String[] args) {

		HesapMakinesi m1 = new HesapMakinesi(5,3,"Mavi");
		System.out.println(m1.toplama());
		m1.sayi1=9;
		System.out.println(m1.cikarma());
		
		HesapMakinesi m2 = new HesapMakinesi(20,11,"Kırmızı");
		System.out.println(m2.toplama());
	}

}

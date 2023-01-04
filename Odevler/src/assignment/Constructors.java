package assignment;

public class Constructors {

	public static void main(String[] args) {

		Product product1 = new Product();
		
		product1.name = "HP";
		product1.id   = 100;;
		product1.islemci = "I7";
		product1.ekranBoyutu = "15";
		product1.stokMiktari = 100;
		product1.fiyat = 650;
		
		System.out.println("Girilen Ürünün İsmi = " + product1.name);
		
		
	}

}

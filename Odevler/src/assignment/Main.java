package assignment;

public class Main 
{
	    double[] d;
	    String[] s;

	    public Main() 
	    { // double tipindeki diziye eleman atanıyor
	        d = new double[5];
	        d[0] = 2.1;
	        d[1] = 3.4;
	        d[2] = 4.6;
	        d[3] = 1.1;
	        d[4] = 0.11;
	// d[5] = 0.56 ; // Hata !
	// String tipindeki diziye eleman atanıyor
	        s = new String[5];
	        s[0] = new String("defter");
	        s[1] = new String("kalem");
	        s[2] = new String("sarman");
	        s[3] = new String("tekir");
	        s[4] = new String("boncuk");
	// s[5] = new String("duman"); // Hata !
	    }

	    public void ekranaBas() { // double tipindeki diziyi ekrana yazdırıyoruz
	        for (int i = 0; i < d.length; i++) {
	            System.out.println("d[" + i + "] = " + d[i]);
	        }
	        System.out.println("-------------------"); // String dizi ekrana yazdırılıyor
	        for (int x = 0; x < s.length; x++) {
	            System.out.println("s[" + x + "] = " + s[x]);
	        }
	    }

	    public static void main(String args[]) {
	        Main deg = new Main();
	        deg.ekranaBas();
	    }
		
	
	
}
	
	
	
	
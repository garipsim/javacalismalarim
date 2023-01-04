package assignment;

public class StaticMember {
	static int x;
	int y;
	
	StaticMember()
	{
		x += 2;
		y ++;
	}
	static int getSquare()
	{
		return x*x;
	}
	public static void main(String[] args)
	{
		StaticMember sm1 = new StaticMember(); // x=2, y=1
		StaticMember sm2 = new StaticMember(); // x=4, y=1
		int z = sm1.getSquare();
		System.out.println("-x " + z + " -y " + sm2.y); // -x  16  -y  1
	}

}

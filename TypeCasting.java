package test;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TypeCasting na = new TypeCasting();
		na.narrow();
		na.wide();

	}
	public void narrow()
	{
		int a = 10;
		byte b = (byte)a;
		System.out.println("Narrow TypeCasting: "+b);
	}
	public void wide()
	{
		byte c = 20;
		int d = c;
		System.out.println(" wide TypeCasting: "+d);
	}
}

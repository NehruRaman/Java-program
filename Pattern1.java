package test;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern1 na = new Pattern1();
		na.pattern1();

	}
	public void pattern1()
	{
		for(char row = 'a';row <= 'd';row++)
		{
			for(int col = 1; col<= 4;col++)
			{
				System.out.print(row+" ");
			}
			System.out.println();
		}
	}

}

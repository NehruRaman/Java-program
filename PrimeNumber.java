package test;

public class PrimeNumber {
	int i =2;
	boolean flag = true;
	int reverse = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumber na = new PrimeNumber();
		na.prime(29);
	}
	public void prime(int num)
	{
		while(num > 0)
		{
         int n = num%10;
         reverse = (reverse*10)+n;
         num = num/10;
		}
		
	
		while(i <= reverse)
		{
			if(reverse%i == 0)
			{
				flag = false;
			}
			i++;
		}
		
	
		if(flag == true)
		{
			System.out.println("prime number is: "+reverse);
		}
		else
		{
			System.out.println("not a prime number is: "+reverse);
		}
	}

}

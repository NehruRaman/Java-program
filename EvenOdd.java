package test;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenOdd na = new EvenOdd();
		na.even(149327);

	}
	public void even(int num)
	{
		int sum =0;
		int count = 0;
		int sum1 =0;
		int sum2 = 0;
		while(num > 0)
		{
			int n = num%10;
			sum = sum+n;
			count++;
			if(count%2==0)
			{
				sum1 = sum1 +sum;
			}
			else
			{
				sum2 = sum2 + sum;
			}
			
				num = num/10;
		}
		sum2 = sum1-sum2;
		System.out.println(sum2);
	}

}

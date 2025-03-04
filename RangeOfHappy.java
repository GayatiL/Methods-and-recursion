class RangeOfHappy
{
	public static void main(String[] args) 
	{
		int st = 1;
		while(st<=100)
		{
			if(isHappy(st))
			{
				System.out.println(st);
			}
			st++;
		}
		
	}

	public static int sum(int num)
	{
		int sum =0;
		while(num>0)
		{
			int last = num%10;
			sum+= last*last;

			num/=10;
		}

		return sum;
	}

	public static boolean isHappy(int num)
	{
		int sum= sum(num);
		while(sum!=1 && sum!=4)
		{
			sum = sum(sum);
		}
		return sum ==1?true:false;
	}
}
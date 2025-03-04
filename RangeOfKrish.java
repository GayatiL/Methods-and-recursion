class RangeOfKrish
{
	public static void main(String[] args) 
	{ 
		for(int st = 1; st<=200 ; st++)
		{
			if(krishNum(st))
			{
				System.out.println(st);
			}

		}

		
	}

	public static boolean krishNum(int num)
	{
		int sum=0 ; 
		int dup = num;
		for(int i=num; i>0 ; i/=10)
		{
			int rem = i%10;
			int fact=1;
			for(int j = 1; j<=rem; j++)
			{
				fact*=j;
			}
			sum+=fact;
		}
		return sum==dup;
	}
}
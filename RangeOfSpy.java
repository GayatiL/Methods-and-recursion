class RangeOfSpy
{
	public static void main(String[] args) 
	{
		for(int st =1; st<=1000; st++)
		{
			if(isSpy(st))
			{
				System.out.println(st);
			}
		}
		
	}

	public static boolean isSpy(int num)
	{
		int sum =0;
		int mulp= 1;

		for(int i = num; i>0 ;i/=10)
		{
			int rem = i%10;
			sum+=rem;
			mulp*=rem;
		}

		return sum==mulp;
	}
}
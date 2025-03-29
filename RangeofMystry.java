class RangeofMystry
{
	public static void main(String[] args) 
	{
		for(int st = 1; st<=200; st++)
		{
			if(isMystry(st))
			{
				System.out.println(st);
			}
		}
		
	}
	public static int reverse(int num)
	{
		int rev = 0;
		for(int i= num; i>0; i/=10)
		{
			rev = rev*10 + i%10;
		}
		return rev;
	}

	public static boolean isMystry(int num)
	{

		for(int i = 1; i<num ; i++)
		{
			if(i+reverse(i)==num)
			{
				return true;

			}
		}
		return false;
	}
}
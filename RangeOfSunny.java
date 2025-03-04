class RangeOfSunny
{
	public static void main(String[] args) 
	{
		for(int st =1; st<=100; st++)
		{
			if(isSunny(st))
			{
				System.out.println(st);
			}
		}
		
	}

	public static boolean isSunny(int num)
	{
		int inr = num+1;
		boolean flag =true; 

		for(int i=1; i<=inr; i++)
		{
			if(i*i==inr)
			{
				flag = true;
				break;
			}
			else 
			{
				flag = false;
			}
		}
		return flag;
	}

}
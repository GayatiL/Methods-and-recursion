class RangeOfPrime
{
	public static void main(String[] args) 
	{
		for(int s=1; s<=100 ; s++)
		{
			if(isPrime(s))
			{
				System.out.println(s);
			}
		}
		

	}

	public static boolean isPrime(int num)
	{  
		int den =2;
		for (;den<num ;den++) 
		{
			if(num%den==0)
			{
				return false;
			}
		}
		return true;
	}
		
}
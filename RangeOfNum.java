class RangeOfDuck
{
	public static void main(String[] args) 
	{
	for(String i='1'; i<=""; i++)
	{
		System.out.println((isDuckNum()));
	}	

	}

	public static  isDuckNum(String num)
	{
		if(num.charAt(0)=="0")
		{
			return false;
		}
		else 
		{
			if (num.contains(0))
			{
				return true;
			}
			else 
			{
				return false;
			}


		}

	}
}
class ReccCount
{
	public static void main(String[] args) 
	{
		System.out.println(count(1234,o));

		
	}

	public static int count(int num, int ct)
	{
		return num==0?ct: count(num/10,ct++)
	}


}
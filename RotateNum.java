class RotateNum
{
	public static void main(String[] args) 
	{
		int num = 51234;
		int last = num %10;
		num/=10;

		int len =0;

		for(int i =num ; i>0; i/=10)
		{
			len++;
		}
		int power = 1;
		for(int i =1; i<=len; i++)
		{
			power*=10;
		}
		int rot = last*power+num;
		System.out.println(rot);
		
	}
}
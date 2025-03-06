class ReccPalindrome
{
	public static void main(String[] args) 
	{
		System.out.println(palindrome(123,123,0));
		
	}

	public static boolean palindrome(int num , int temp, int rev)
	{
		if(temp == 0)
		{
			return num==rev;
		}
		else 
		{
			rev = rev *10+temp%10;

			return palindrome(num,temp/10, rev);
		}
	}
}
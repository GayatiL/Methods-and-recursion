import java.util.Scanner;
class ReccReverse
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int ip= sc.nextInt();
		reverse(ip,0);
		
	}

	public static void reverse(int num, int rev)
	{
		if(num==0)
		{
			System.out.println(rev);
		}

		else if(num!=0)
		{
			rev = rev*10+ num%10;

			reverse(num/10, rev);
		}
		return ; 
	}


}
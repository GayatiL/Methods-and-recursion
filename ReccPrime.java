import java.util.Scanner;
class ReccPrime
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number: ");
		int ip = sc.nextInt();

		if(isPrime(ip,2))
		{
			System.out.println("is prime");
		}
		else 
		{
			System.out.println("not prime");
		}
		
	}

	public static boolean isPrime(int num, int den)
	{
		if(num==den)
		{
			return true;
		}
		else if(num%den==0)
		{
			return false;
		}

		return isPrime(num, ++den);
	}
}
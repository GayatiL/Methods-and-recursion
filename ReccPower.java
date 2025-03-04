import java.util.Scanner;
class s
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println(" enetr the base value: ");
		int b = sc.nextInt();
		System.out.println("enetr the raise value: ");
		int p = sc.nextInt();
		System.out.println(power(b,p));
		
	}

	public static int power(int base , int raise)
	{
		if(raise==0)
		{
			return 1;
		}

		return base*power(base, raise-1);
	}
}
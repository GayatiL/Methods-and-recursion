import java.util.Scanner;
class ReccFact
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number: ");

		System.out.println(fact(sc.nextInt()));
		
	}

	public static int fact(int num)
	{
		if(num==0)
		{
			return 1;         //because 0!=1
		}

		return num*fact(num-1);
	}
}
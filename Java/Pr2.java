import java.util.*;
class first
{
	Scanner sc = new Scanner(System.in);
	int num[] = new int[10];

	first()
	{
		for(int i=0;i<=9;i++)
		{
			System.out.print("Enter Number "+(i+1)+" : ");
			num[i] = sc.nextInt() ;
		}
	}
}
class second extends first
{
	second()
	{
		for(int i=0;i<=9;i++)
		{
			if(num[i]%2==0)
			{
				System.out.println(num[i] + " : Even");
			}
			else
			{
				System.out.println(num[i] + " : Odd");

			}
		}
	}
}
class Pr2
{
	public static void main(String[] args) {
		
		second s = new second();
	}
}
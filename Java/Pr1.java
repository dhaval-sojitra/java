class first
{
	int i;
	int num = 17;
	first()
	{
		for(i=1;i<=25;i++)
		{
			if(i%2==0)
			{
				System.out.println(i+" : Even");
			}
			else
			{
				System.out.println(i+" : Odd");
			}
		}
	}

}
class table extends first
{
	table(){
	for(i=1;i<=10;i++)
	{
		System.out.println(num+" X "+i+" = "+num*i);
	}
}
}
class Pr1
{
	public static void main(String[] args) {
		first f=new first();
		table t = new table();
	}
}

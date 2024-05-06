import java.util.*;
class first
{
	Scanner sc = new Scanner(System.in);
	String strem;
	String year;
	int s;
	
	first()
	{
		System.out.print("Enter Your Stream : ");
		strem = sc.nextLine();
		System.out.print("Enter Your Accadmic Year :");
		year = sc.nextLine();
		System.out.print("Enter Your "+strem+" Semester :");
		s = sc.nextInt();
	}
}
class second extends first
{
	second()
	{
		int sem[] = new int[s];
		String sub[][] = new String[s][4];
		int sub1;
		int s1;
		for(int i=0;i<s;i++)
		{
			sem[i] = i+1;
		}
		
		for(int i=0;i<s;i++)
		{
			System.out.println("Enter Subjects of sem "+(i+1)+" : " );
			System.err.println("-----------------------------------------------");
			// sub1 = sc.nextInt();
			for(int a=0;a<=3;a++)
			{
				System.err.println("Enter Subject"+(a+1)+ "of Sem "+(i+1)+" : ");
				sub[i][a] = sc.nextLine();
			}
		}
		System.out.println("Strem : "+strem);
		System.out.println("Acadmic Year : "+year);
		for(int i=0;i<sem.length;i++)
		{
			System.out.println("Semester : "+sem[i]);
			System.err.println("-------------------------------------");
			for(int a=0;a<=3;a++)
			{
				System.err.println("Subject  : "+(a+1)+sub[i][a]);
			}
			System.err.println("------------------------------------------");
		}
		
	}
}
class Pr3
{
	public static void main(String[] args) {
		second s  = new second();
	}
}
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
		int s1;
		String sub[] = new String[];
		for(int i=0;i<s;i++)
		{
			sem[i] = i+1;
		}
		System.out.println("Enter Subjects Number in sem "+(i+1)+" :");
		s1 = sc.nextInt();
		System.out.println(strem);
		System.out.println(year);
		for(int i=0;i<sem.length;i++)
		{
			System.out.println(sem[i]);
		}
	}
}
class Pr3
{
	public static void main(String[] args) {
		second s  = new second();
	}
}
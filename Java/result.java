import java.util.*;
class GET
{
	Scanner sc=new Scanner(System.in);
	String sub[] = new String[5];
	GET()
	{
		int a=1;
		for(int i=0;i<sub.length;i++)
		{	
			System.out.print("Enter Subject "+a+" :");
			sub[i] = sc.nextLine();
			a++;
		}
	}
}
class MARK extends GET
{
	int mark[] = new int[5];
	MARK()
	{
		for(int i=0;i<mark.length;i++)
		{
			System.out.print("Enter Marks of "+sub[i]+" : ");
			mark[i] = sc.nextInt();
		}
	}
	void display()
	{
		int tot=0;
		System.out.println("\t\t MCA SEM 2 RESULT\t\t");
		System.out.println("\t------------------------------------------");
		System.out.println("\tNo\tSubject\t\tMarks");
		System.out.println("\t..........................................");
		for(int i=0;i<mark.length;i++)
		{
			System.out.println("\t"+(i+1)+"\t"+sub[i]+"\t\t"+mark[i]);
			tot = tot+mark[i];
		}
		System.out.println("\t------------------------------------------");
		System.out.println("\t\tTotal : "+tot);
		System.out.println("\t\tPercentage : "+(tot/5));
	}

}
class result
{
	public static void main(String[] args) {
		MARK m = new MARK();
		m.display(); 
	}
}
import java.util.*;
class GET
{
	Scanner sc=new Scanner(System.in);
	String sub[] = new String[5];
	GET()
	{
		for(int i=0;i<sub.length;i++)
		{	
			System.out.print("Enter Subject "+(i+1)+" :");
			sub[i] = sc.nextLine();
			
		}
	}
}
class MARK extends GET
{
	int mark[] = new int[5];
	MARK()
	{
		get:
		for(int i=0;i<mark.length;i++)
		{
			System.out.print("Enter Marks of "+sub[i]+" : ");
			mark[i] = sc.nextInt();
			if(mark[i]>100)
			{
				System.out.println("Please Enter Valid Marks.");
				i=i-1;
				continue get;
			}
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
		
			if(mark[0]<50 || mark[1]<50 || mark[2]<50 || mark[3]<50 || mark[4]<50 )
			{
				System.out.println("\t\tPercentage : Fail");
			} 
			else
			{
				System.out.println("\t\tPecentage : "+tot/5);
			}	
	}

}
class result 
{
	public static void main(String[] args) {
		MARK m = new MARK();
		m.display(); 
	}
}
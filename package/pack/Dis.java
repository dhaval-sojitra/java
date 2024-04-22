package pack;
import pack.*;
public class Dis
{
	public Dis()
	{
		Marks m = new Marks();
		int tot=0;
		System.out.println("---------Result---------");

		System.out.println("No\tSubject\t\tMarks");

		for(int i=0;i<m.mark.length;i++)
		{
			System.out.println((i+1)+"\t"+m.s.sub1[i]+"\t\t"+m.mark[i]);
			tot = tot + m.mark[i];
		}
		float per = tot/5;
		System.out.println("-----------------------------------");
		System.out.println("\t\t\tTotal :"+tot);
		System.out.println("\t\t\tPercentage :"+per);

	}
}
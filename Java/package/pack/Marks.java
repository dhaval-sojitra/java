package pack;
import pack.*;
public class Marks
{
	Sub s = new Sub();
	int mark[] = new int[5];
	public Marks()
	{
		System.out.println("---------Enter Marks---------");

		for(int i=0;i<mark.length;i++)
		{
			System.out.print("Enter "+ s.sub1[i]+ " Marks :");
			mark[i] = s.sc.nextInt();

		}
	}
}
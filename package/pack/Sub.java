package pack;
import java.util.*;
public class Sub
{
	Scanner sc = new Scanner(System.in);
	String sub1[] = new String[5];
	public Sub()
	{
		System.out.println("---------Enter Subject---------");
		for(int i=0;i<sub1.length;i++)
		{
			System.out.print("Enter Subject "+(i+1)+" :");
			sub1[i]= sc.nextLine();
		}
		System.out.println("\n");

	}
}
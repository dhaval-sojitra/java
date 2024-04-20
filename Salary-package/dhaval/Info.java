package dhaval;
import java.util.*;
public class Info{
	Scanner sc= new Scanner(System.in);
	String name;
	String post;
	String city;
	int mno;
	int salary;

	public Info()
	{	System.out.println("------------Enter Your Details------------");
		System.out.print("Enter Your Name :");
		name = sc.nextLine();
		System.out.print("Enter Your Post :");
		post = sc.nextLine();
		System.out.print("Enter Your city :");
		city = sc.nextLine();
		System.out.print("Enter Your Mobile Number :");
		mno = sc.nextInt();
		System.out.print("Enter Your Salary :");
		salary = sc.nextInt();
	}
}
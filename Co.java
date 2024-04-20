import java.util.*;
class First
{
	First(int no)
	{
		System.out.println("Roll No : "+no);
	}
	First(String nm,int no)
	{
		System.out.println("Student Name :"+nm);
		System.out.println("Roll No :"+no);

	}
}
class Co
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Student Name :");
		String nm = sc.nextLine();
		System.out.print("Enter Roll No :");
		int no = sc.nextInt();

		First e=new First(no);
		First f=new First(nm,no);

	}
}
import java.util.*;
class First
{
	void std(int no)
	{
		System.out.println("Roll No :"+no);
	}
	void std(String nm,int no)
	{
		System.out.println("Student Name : "+nm);
		System.out.println("Roll No : "+no);
	}
}
class Mo2
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Name :");
		String nm=sc.nextLine();
		System.out.print("Enter Roll No:");
		int no=sc.nextInt();

		First f=new First();
		f.std(no);
		f.std(nm,no);

	}
}
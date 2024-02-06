import java.util.*;
class First
{
	First(int no)
	{
		if(no % 10==7 || no/7==0)
			{
				System.out.println("Given number is Buzz");
			}
		else
			{
				System.out.println("Given number is not Buzz Number");
			}
	}

}
class Buzz
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Any Number :");
		int no = sc.nextInt();
		First f=new First(no);
	
	}
	
}
import java.util.*;
class First
{
	boolean duck(int no)
	{
		while(no!=0)
		{
			if(no%10==0)
				return true;
			no = no/10;
		}
		return false;
	}	
}
class Duck
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter Any Number :");
	int no = sc.nextInt();

	First f= new First();
	boolean res = f.duck(no);
	if(res ==true)
	{
		System.out.println("Given number is duck number");
	}
	else
	{
		System.out.println("Given number is not duck number");
	}
	}
	


}
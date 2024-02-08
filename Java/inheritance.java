import java.util.*;
class First
{
	Scanner sc = new Scanner(System.in);
	int no;
	First()
	{
	System.out.print("Enter Any Number :");
	no = sc.nextInt();
	}
}
class Table extends First
{
	Table()
	{System.out.println("Table =>"+no);
		for(int i=1;i<=10;i++)
		{
			System.out.println(no+" X "+i+" = "+(no*i));
		}
	}
}
class Square extends First
{
	Square()
	{
		System.out.println("Square =>"+no);
		for(int i=1;i<=no;i++)
		{
			System.out.println(i + " x " + i +"="+ (i*i));
		}

	}
}
class inheritance
{
	public static void main(String[] args) {
		Table t=new Table();
		Square s= new Square();
	}
}
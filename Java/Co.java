import java.util.*;
class First
{
	First(int a){
		System.out.println("Square is :"+(a*a));
	}
}
class Co{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		First f=new First(x);
	}
}
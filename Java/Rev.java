import java.util.*;
class Rev
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int temp=0,rev=0,rem=0;
		System.out.print("Enter NO :");
		int no = sc.nextInt();
		temp=no;
		while(temp>0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		System.out.println("Original number is :"+no);
		System.out.println("Reverse number is :"+rev);

		if(no==rev)
		{
			System.out.println("Given number "+no+" is palindrome number...");
		}
		else
		{
			System.out.println("Given number "+no+" is not palindrome number...");
		}
	}
}
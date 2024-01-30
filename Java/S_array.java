import java.util.*;
class S_array
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s_nm[] = new String[5];
		int k=1;
		for(int i=0;i<=4;i++)
		{
			System.out.print("Enter Subject "+k+" : ");			
			s_nm[i]=sc.nextLine();
			k++;
		}
		int k1=1;
		for(int i=0;i<=4;i++)
		{
			System.out.println("Subject "+k1+" : "+s_nm[i]);
			k1++;
		}

	}
}
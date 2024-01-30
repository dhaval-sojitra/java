import java.util.*;
class Criket
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String p_nm[] = new String[5];
		int run[] = new int[5];
		int p=1;
		for(int i=0;i<=4;i++)
		{
			System.out.print("Enter Name of Player "+p+":");
			p_nm[i] = sc.nextLine();
			p++;
		}		
		for(int i=0;i<=4;i++){
			int t=1;
			for(int a=0;a<=4;a++){
				System.out.print("Enter Run of "+p_nm[i]+" in Tournament "+t+" : ");
				run[i]=sc.nextInt();
				t++;
			}
		}

		System.out.println("Name\tTournament 1\tTournament 2\tTournament 3\tTournament 4\tTournament 5\tTotal");
		for(int i=0;i<=4;i++){
			System.out.println(p_nm[i]+"\t"+run[i]);
		}




		// int p1=1;
		// for(int i=0;i<=4;i++)
		// {
		// 	System.out.println("Player "+p1+":"+p_nm[i]);		
		// 	p1++;
		// }

	}

}
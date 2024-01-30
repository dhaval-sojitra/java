import java.util.*;
class Criket
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String p_nm[] = new String[5];
		int run[][] = new int[5][5];
		int trun[] = new int[5];
		int p=1;
		for(int i=0;i<=4;i++)
		{
			System.out.print("Enter Name of Player "+p+":");
			p_nm[i] = sc.nextLine();
			p++;
		}
		int tot=0;
		System.out.println("\t------------------Enter Player Runs------------------");		
		for(int i=0;i<=4;i++){
			int t=1;
			System.out.println("\t------------------"+p_nm[i]+"------------------");
			for(int a=0;a<=4;a++){
				System.out.print("Enter Run of "+p_nm[i]+" in Tournament "+t+" : ");
				run[i][a]=sc.nextInt();
				t++;
				
			}
		}
		System.out.println("\t------------------Overview------------------");		
		System.out.println("Name\tTournament 1\tTournament 2\tTournament 3\tTournament 4\tTournament 5\tTotal");
		for(int i=0;i<=4;i++){
			for(int a=0;a<=4;a++)
			{
				tot=tot+run[i][a];
			}
			trun[i]=tot;
			System.out.println(p_nm[i]+"\t"+run[i][0]+"\t\t"+run[i][1]+"\t\t"+run[i][2]+"\t\t"+run[i][3]+"\t\t"+run[i][4]+"\t\t"+trun[i]);
			tot=0;
		}
		System.out.println("\t------------------Man of the Match------------------");
		int temp=0;
		for(int i=0;i<=4;i++)
		{
			for(int j=i+1;j<=4;j++)
			{
					if(trun[i]>trun[j]){
						temp=trun[i];
						trun[i]=trun[j];
						trun[j]=temp;
					}
				}
			System.out.println(trun[i]);
		}



	}

}

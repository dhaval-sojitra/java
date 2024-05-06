// 12.
//     1
//    2 2
//   3 3 3
//  4 4 4 4
// 5 5 5 5 5
public class Twelve {
    public static void main(String[] args) {
        int a = 1;
        boolean x=false;
        for(int i=5;i>=1;i--)
        {
            int d=1;
            for(int j=1;j<=9;j++)
            {
                
                if(j==i || x==true)
                {
                    System.err.print(a);

                }
                else
                {
                    System.err.print(" ");
                }
            }
            System.out.println();
            a += 1;
        }
    }
}

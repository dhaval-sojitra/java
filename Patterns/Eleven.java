// 11.
//     *****
//    *****
//   *****
//  *****
// *****
public class Eleven {
    public static void main(String[] args) {
        int a=0;
        for(int i=5;i>=1;i--)
        { 
            int d = 9-a;
            for(int j=1;j<=9;j++)
            {
                if(j>=i)
                {
                    if(j>d)
                    {
                        System.err.print(" ");
                    }
                    else
                    {
                        System.err.print("*");
                    }
                }
                else
                {
                    System.err.print(" ");
                }
            }
            System.err.println();
            a += 1;
        }
    }
}

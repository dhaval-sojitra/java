// 10.
// *      *
// **    **
// ***  ***
// ********
// ********
// ***  ***
// **    **
// *      *
public class Ten {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++)
        {
            int d=9-i;
            for(int j=1;j<=8;j++)
            {
                if(j<=i || j>=d)
                {
                    System.err.print("*");                    
                }
                else
                {
                    System.err.print(" ");
                }
            }
            System.err.println();
        }
        for(int i=4;i>=1;i--)
        {
            int d = 9-i;
            for(int j=1;j<=8;j++)
            {
                if(j<=i || j>=d)
                {
                    System.err.print("*");
                }
                else
                {
                    System.err.print(" ");
                }
            }
            System.err.println();
        }
    }
}

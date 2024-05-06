// 8.
// 1
// 2   3
// 4   5  6
// 4   8  9 10
// 11 12 13 14 15



public class Eight {
    public static void main(String[] args) {
        int x=1;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(x<10)
                {
                    System.err.print(x+"  ");
                }
                else
                {
                    System.err.print(x+" ");
                }
                x++;
            }
            System.err.println();
        }
    }
}

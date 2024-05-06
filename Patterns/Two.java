// 2.
// *****
// *   *
// *   *
// *****

public class Two {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++)
        {
            for(int d=1;d<=5;d++)
            {
                if(i==2 || i==3)
                {
                    if(d==2 || d==3 || d==4)
                    {
                        System.err.print(" ");
                    }
                    else{
                        System.err.print("*");                        
                    }
                }
                else{
                    System.err.print("*");
                }
            }
            System.err.println();
        }
    }
}

import java.util.*;
class fibonaci {
    public static void main(String[] args) {
        int x=0,y=1,sum=0,n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number you want to print series :");
        n = sc.nextInt();
        
        while(sum<=n)
        {
            System.err.println(sum);
            x=y;
            y=sum;
            sum=x+y;
        }
    }    
}

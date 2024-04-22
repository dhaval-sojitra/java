import java.util.*;
class get
{   Scanner sc = new Scanner(System.in);
    get()
    {
        System.err.print("Enter Any Number : ");
        int num = sc.nextInt();
        boolean val = false;
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                val = true;
            }
            
        }
        if(val)
            System.err.println("Given Number "+num+" is not Prime Number..");
        else
            System.err.println("Given Number "+num+" is Prime Number..");

    }
}
public class prime {
    public static void main(String[] args) {
        get g = new get();
    }
}

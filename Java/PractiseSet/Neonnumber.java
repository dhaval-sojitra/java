// 5) Write a program user through input one number and then check this number
// is neon or not. Using Constructor.
// Example: 9*9=81  8+1=9  This Number is Neon
import java.util.*;
class chk{
    Scanner sc = new Scanner(System.in);
    chk(){
        System.err.print("Enter Any Number :");
        int num = sc.nextInt();
        int sqr = num*num;
        int temp=sqr,sum=0,i=0;
        while(temp>0)
        {
            sum = sum + temp%10;
            temp = temp/10;
        }
        System.err.println(sum);
        if(sum==num)
            System.err.println("Given Number is Neon Number..");
        else
            System.err.println("Given Number is not Neon Number..");

    }
}
public class Neonnumber {
    public static void main(String[] args) {
        chk c = new chk();
    }
}

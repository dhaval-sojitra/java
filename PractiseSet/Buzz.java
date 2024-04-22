// 7) Write a Program a number is said to be Buzz Number if it ends with 7 or is divisible
// by 7.
// Example: 1007 is a Buzz Number.
import java.util.*;
class chk{
    Scanner sc = new Scanner(System.in);
    chk(){
        System.err.print("Enter Any Number :");
        int num = sc.nextInt();
        if(num%10==7 || num%7==0)
            System.err.println("Given Number is Buzz Number..");
        else
        System.err.println("Given Number is not Buzz Number..");

    }
}
public class Buzz {
    public static void main(String[] args) {
        chk c =new chk();
    }
}

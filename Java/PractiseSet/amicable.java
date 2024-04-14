// 1) Write a program user through input two numbers and check amicable
// number using Constructor.
// Example– 220 and 284 are Amicable Numbers.
// Divisors of 220 = 1, 2, 4, 5, 10, 11, 20, 22, 44, 55, 110
// 1+2+4+5+10+11+20+22+44+55+110=284
// Divisors of 284 = 1, 2, 7, 71, 142
// 1+2+7+71+142=220

import java.util.*;
class chk{
    Scanner sc = new Scanner(System.in);
    chk(){
        System.err.print("Enter Number 1 :");
        int no1 = sc.nextInt();
        System.err.print("Enter Number 2 :");
        int no2 = sc.nextInt();

        int sum1=0;
        for(int i=1;i<=no1/2;i++)
        {
            if(no1%i==0)
                sum1+=i;
        }  
        int sum2=0;
        for(int i=1;i<=no2/2;i++)
        {
            if(no2%i==0)
                sum2+=i;
        }  
        if(sum1==no2 && sum2==no1)
            System.err.println("Given Numbers is Amicable...");
        else
        System.err.println("Given Numbers is not Amicable...");


    }
}

public class amicable{
    public static void main(String[] args) {
        chk c = new chk();
    }
}
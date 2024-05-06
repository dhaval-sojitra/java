// 10. Write a program to print Fibonacci series of n terms where n is input by user :
// 0 1 1 2 3 5 8 13 21 .....
// In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Number : ");
        int no = sc.nextInt();
        int x = 0,y = 1,sum=0,a=3;
        System.err.print(x+" "+y+" ");
        while(a<=no)
        {
            sum += y ;
            System.err.print(sum+" ");
            y=sum;
            a++;
        }

    }
}

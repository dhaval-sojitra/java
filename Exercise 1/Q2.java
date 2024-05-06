// 2. Write a function to print the sum of all odd numbers from 1 to n.

import java.util.Scanner;

public class Q2 {
    public static void odd(int x)
    {
        int sum=0;
        for(int i=1;i<=x;i++)
        {
            if(i%2!=0)
            {
                sum += i;
            }
        }
        System.err.println("Sum of all odd numbers from 1 to "+x+" : "+sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter Any Number : ");
        int a = sc.nextInt();
        odd(a);
    }
}

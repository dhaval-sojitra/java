// 1.Enter 3 numbers from the user & make a function to print their average.

import java.util.Scanner;

class Q1
{
    public static void avg(int a,int b,int c)
    {
        int avg = (a+b+c)/3;
        System.err.println("Average Number of given Numbers :"+avg);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter No 1 :");   
        int a = sc.nextInt();
        System.err.print("Enter No 2 :");   
        int b = sc.nextInt();
        System.err.print("Enter No 3 :");   
        int c = sc.nextInt();

        avg(a, b, c);
    }
}
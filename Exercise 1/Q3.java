// 3. Write a function which takes in 2 numbers and returns the greater of those two.

import java.util.Scanner;

public class Q3 {
    public static int greater(int x,int y)
    {
        if(x>y)
        {
            return x;
        }
        else
        {
            return y;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter No 1 : ");
        int a = sc.nextInt();
        System.err.print("Enter No 2 : ");
        int b = sc.nextInt();
        System.err.println("Greter Number : "+greater(a,b));
        
    }
}

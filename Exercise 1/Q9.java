// 9. Write a function that calculates the Greatest Common Divisor of 2 numbers. (BONUS)

import java.util.Scanner;

public class Q9 {
    public static void get(int x,int y){
        while(x != y)
        {
            if(x>y)
            {
                x = x - y;

            }
            else{
                y = y - x;
            }
        }
        System.err.println("GCD :"+y);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter No1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter No2 :" );
        int num2 = sc.nextInt();
        get(num1,num2);
    }
}

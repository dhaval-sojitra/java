// 8. Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. .

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter Any Number : ");
        int a = sc.nextInt();
        System.out.print("Enter Value of power : ");
        int p = sc.nextInt();
        int val = 1;
        for(int i=1;i<=p;i++)
        {
            val *= a;
        }
        System.err.println("value :"+val);
    }
}

// 5. Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.

import java.util.Scanner;

public class Q5 {
    public static void get(int x)
    {
        if(x<=18)
        {
            System.err.println("Sorry! You are not eligible for vote...");
        }
        else
        {
            System.err.println("You are eligible for vote...");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter Your Age : ");
        int a = sc.nextInt();
        get(a);
    }
}

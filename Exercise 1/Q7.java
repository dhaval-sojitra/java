// 7. Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        int x=1,p=0,n=0,z=0;
        Scanner sc = new Scanner(System.in);
        do{
            System.err.println("Enter Number : ");
            int a = sc.nextInt();
            if(a==0)
            {
                z++;
            }
            else if(a>0)
            {
                p++;
            }
            else
            {
                n++;
            }
            System.err.print("Press 1 for Continue and 0 for Stop");
            x = sc.nextInt();
        }
        while(x==1);
        System.err.println("Positive Numbers :"+p);
        System.err.println("Nagative Numbers :"+n);
        System.err.println("Zero Numbers :"+z);
            

    }
}
